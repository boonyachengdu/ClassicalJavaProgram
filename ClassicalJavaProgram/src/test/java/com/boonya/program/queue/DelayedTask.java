package com.boonya.program.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/**
 * 参考地址：https://my.oschina.net/itblog/blog/516670
 * @package com.boonya.program.queue.DelayedTask
 * @date   2016年11月24日  下午4:03:59
 * @author pengjunlin
 * @comment   
 * @update
 */
public class DelayedTask implements Runnable, Delayed {

    private static int counter = 0;
    
    protected static List<DelayedTask> sequence = new ArrayList<>();
    
    private final int id = counter++;
    
    private final int delayTime;
    
    private final long triggerTime;
    
    public DelayedTask(int delayInMillis) {
        delayTime = delayInMillis;
        triggerTime = System.nanoTime() + TimeUnit.NANOSECONDS.convert(delayTime,TimeUnit.MILLISECONDS);
        sequence.add(this);
    }
    
    @Override
    public int compareTo(Delayed o) {
        DelayedTask that = (DelayedTask)o;
        if (triggerTime < that.triggerTime) return -1;
        if (triggerTime > that.triggerTime) return 1;
        return 0;
    }

    /**
     * 剩余的延迟时间
     */
    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(triggerTime - System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    @Override
    public void run() {
        System.out.println(this + " ");
    }
    
    @Override
    public String toString() {
        return String.format("[%1$-4d]", delayTime) + " Task " + id;
    }
    
    public static class EndSentinel extends DelayedTask {
        private ExecutorService exec;
        public EndSentinel(int delay, ExecutorService exec) {
            super(delay);
            this.exec = exec;
        }
        @Override
        public void run() {
            System.out.println(this + " calling shutDownNow()");
            exec.shutdownNow();
        }
    }
}

class DelayedTaskConsumer implements Runnable {
	
    private DelayQueue<DelayedTask> tasks;
    
    public DelayedTaskConsumer(DelayQueue<DelayedTask> tasks) {
        this.tasks = tasks;
    }
    @Override
    public void run() {
        try {
            while(!Thread.interrupted()) {
                tasks.take().run();//run tasks with current thread.
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
        System.out.println("Finished DelaytedTaskConsumer.");
    }
}
