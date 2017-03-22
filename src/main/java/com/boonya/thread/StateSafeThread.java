package com.boonya.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/**
 * 状态安全线程
 * 
 * @package com.boonya.thread.StateSafeThread
 * @date   2017年3月22日  下午4:28:57
 * @author pengjunlin
 * @comment   
 * @update
 */
public class StateSafeThread extends Thread {

	private static AtomicInteger atomicCount = new AtomicInteger(0);// 多线程：线程安全的

	private volatile static AtomicInteger volatileAtomicCount = new AtomicInteger(0);// 多线程：线程安全的
	
	
	@Override
	public void run() {
		final Object lock = new Object();  
		for (int i = 0; i < 50000; i++) {  
            new Thread(new Runnable() {  
                  
                @Override  
                public void run() {  
                   synchronized (lock) {
                	   // Nothing....
				   }
                   atomicCount.incrementAndGet();  
                   volatileAtomicCount.incrementAndGet();  
                }  
            }).start();  
        }  
		// 休息5秒, 保证线程中的计算完成  
        try {  
            TimeUnit.SECONDS.sleep(5);  //关键
        } catch (InterruptedException e) {  
            e.printStackTrace();  
        }  
        System.out.println("Thread Name=====:"+this.getName());  
        System.out.println("线程并发执行对计数器累计5000次，看并发结果！");  
        System.out.println("atomicCount=" + atomicCount.get());  
        System.out.println("volatileAtomicCount=" + volatileAtomicCount.get());
	}

}
