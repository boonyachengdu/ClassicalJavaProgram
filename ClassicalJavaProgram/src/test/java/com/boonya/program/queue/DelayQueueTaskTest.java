package com.boonya.program.queue;

import java.util.Random;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.junit.Test;

public class DelayQueueTaskTest {

	@Test
	public void test() {
		// milliseconds
		int maxDelayTime = 5000;
		Random random = new Random(47);
		ExecutorService exec = Executors.newCachedThreadPool();
		DelayQueue<DelayedTask> queue = new DelayQueue<DelayedTask>();
		// 填充10个休眠时间随机的任务
		for (int i = 0; i < 10; i++) {
			queue.put(new DelayedTask(random.nextInt(maxDelayTime)));
		}
		// 设置结束的时候。
		queue.add(new DelayedTask.EndSentinel(maxDelayTime, exec));
		exec.execute(new DelayedTaskConsumer(queue));

		// 保存主线程存活
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
