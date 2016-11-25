package com.boonya.program.queue;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.junit.Test;

public class ConcurrentLinkedQueueTest {

	private static ConcurrentLinkedQueue<Integer> concurrentLinkedQueue = new ConcurrentLinkedQueue<Integer>();

	@Test
	public void test(){
		ExecutorService executorService = Executors.newFixedThreadPool(2);

		executorService.submit(new Producer("producer1"));
		executorService.submit(new Producer("producer2"));
		executorService.submit(new Producer("producer3"));
		executorService.submit(new Consumer("consumer1"));
		executorService.submit(new Consumer("consumer2"));
		executorService.submit(new Consumer("consumer3"));
		
		// 保持主线程存活
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static class Producer implements Runnable {
		private String name;

		public Producer(String name) {
			this.name = name;
		}

		public void run() {
			for (int i = 1; i < 10; ++i) {
				System.out.println(name + " start producer " + i);
				concurrentLinkedQueue.add(i);
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// System.out.println(name+"end producer " + i);
			}
		}
	}

	static class Consumer implements Runnable {
		private String name;

		public Consumer(String name) {
			this.name = name;
		}

		public void run() {
			for (int i = 1; i < 10; ++i) {
				try {

					System.out.println(name + " Consumer "
							+ concurrentLinkedQueue.poll());

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// System.out.println();
				// System.out.println(name+" end Consumer " + i);
			}
		}
	}

}
