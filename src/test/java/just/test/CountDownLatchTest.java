package just.test;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.junit.Test;

public class CountDownLatchTest {

	@Test
	public void test() {
		int NUMBER_OF_TASKS = 1000;
		CountDownLatch countDownLatch = new CountDownLatch(NUMBER_OF_TASKS);
		countDownLatch.countDown();
		System.out.println("count:" + countDownLatch.getCount());
	}

	@Test
	public void testWorker() {
		WorkManager workManager = new WorkManager();
		System.out.println("START WORK");
		workManager.startWork();
		System.out.println("WORK STARTED");
		workManager.finishWork();
		System.out.println("FINISHED WORK");
	}

}

class Worker implements Runnable {

	private CountDownLatch countDownLatch;

	public Worker(CountDownLatch countDownLatch) {
		this.countDownLatch = countDownLatch;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(getRandomSeconds()); // sleep random time to simulate
												// long running task
			System.out.println("Counting down: "
					+ Thread.currentThread().getName());
			this.countDownLatch.countDown();
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

	// returns a long between 0 and 9999
	private long getRandomSeconds() {
		Random generator = new Random();
		return Math.abs(generator.nextLong() % 10000);
	}
}

class WorkManager {

	private CountDownLatch countDownLatch;
	private static final int NUMBER_OF_TASKS = 5;

	public WorkManager() {
		countDownLatch = new CountDownLatch(NUMBER_OF_TASKS);
	}

	public void finishWork() {
		try {
			System.out.println("START WAITING");
			countDownLatch.await();
			System.out.println("DONE WAITING");
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

	public void startWork() {
		ExecutorService executorService = Executors
				.newFixedThreadPool(NUMBER_OF_TASKS);

		for (int i = 0; i < NUMBER_OF_TASKS; i++) {
			Worker worker = new Worker(countDownLatch);
			executorService.execute(worker);
		}
		executorService.shutdown();
	}
}
