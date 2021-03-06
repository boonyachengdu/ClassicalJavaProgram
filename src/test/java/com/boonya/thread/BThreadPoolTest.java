package com.boonya.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

/**
 * 并发包线程池测试
 * 
 * @package com.boonya.thread.BThreadPoolTest
 * @date   2017年4月26日  下午3:41:12
 * @author pengjunlin
 * @comment   
 * @update
 */
public class BThreadPoolTest {
	
	int poolSize=5;
	
	/**
	 * 线程保持固定个数的线程存活数量
	 * 
	 * @MethodName: testFixedThreadPool 
	 * @Description: 
	 * @throws
	 */
	@Test
	public void testFixedThreadPool(){
		// 线程内空闲保持poolSize个线程
		ExecutorService executorService=Executors.newFixedThreadPool(poolSize);
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.shutdown();
	}
	/**
	 * 线程保持固定个数的线程存活数量
	 * 
	 * @MethodName: testFixedThreadPoolThreadFactory 
	 * @Description: 
	 * @throws
	 */
	@Test
	public void testFixedThreadPoolThreadFactory(){
		// 线程内空闲保持poolSize个线程
		ThreadFactory threadFactory=Executors.defaultThreadFactory();
		ExecutorService executorService=Executors.newFixedThreadPool(poolSize,threadFactory);
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.shutdown();
	}
	
	/**
	 * 按需缓存线程池
	 * 
	 * @MethodName: testCachedThreadPool 
	 * @Description: 
	 * @throws
	 */
	@Test
	public void testCachedThreadPool(){
		// 有任务时才创建新线程，空闲线程保留60秒
		ExecutorService executorService=Executors.newCachedThreadPool();
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.shutdown();
	}
	
	/**
	 * 按需缓存线程池
	 * 
	 * @MethodName: testCachedThreadPoolThreadFactory 
	 * @Description: 
	 * @throws
	 */
	@Test
	public void testCachedThreadPoolThreadFactory(){
		// 有任务时才创建新线程，空闲线程保留60秒
		ThreadFactory threadFactory=Executors.defaultThreadFactory();
		ExecutorService executorService=Executors.newCachedThreadPool(threadFactory);
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.shutdown();
	}
	
	/**
	 * 单个线程依次执行任务线程池
	 * 
	 * @MethodName: testSingleThreadExecutor 
	 * @Description: 
	 * @throws
	 */
	@Test
	public void testSingleThreadExecutor(){
		// 单个线程依次执行任务
		ExecutorService executorService=Executors.newSingleThreadExecutor();
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.shutdown();
	}
	
	/**
	 * 单个线程依次执行任务线程池
	 * 
	 * @MethodName: testSingleThreadExecutorWithThradFactory 
	 * @Description: 
	 * @throws
	 */
	@Test
	public void testSingleThreadExecutorWithThradFactory(){
		// 单个线程依次执行任务
		ThreadFactory threadFactory=Executors.defaultThreadFactory();
		ExecutorService executorService=Executors.newSingleThreadExecutor(threadFactory);
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.shutdown();
	}
	
	/**
	 * @throws InterruptedException 
	 * 单个线程依次按时间计划执行任务线程池
	 * 
	 * @MethodName: testSingleThreadScheduledExecutor 
	 * @Description: 
	 * @throws
	 */
	@Test
	public void testSingleThreadScheduledExecutor() throws InterruptedException{
		// 单个线程依次按计划执行任务
		ScheduledExecutorService executorService=Executors.newSingleThreadScheduledExecutor();
		executorService.awaitTermination(300, TimeUnit.MILLISECONDS); 
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.shutdown();
	}
	
	/**
	 * @throws InterruptedException 
	 * 单个线程依次按时间计划执行任务线程池
	 * 
	 * @MethodName: testSingleThreadScheduledExecutorWithThradFactory 
	 * @Description: 
	 * @throws
	 */
	@Test
	public void testSingleThreadScheduledExecutorWithThradFactory() throws InterruptedException{
		// 单个线程依次按计划执行任务
		ThreadFactory threadFactory=Executors.defaultThreadFactory();
		ScheduledExecutorService executorService=Executors.newSingleThreadScheduledExecutor(threadFactory);
		executorService.awaitTermination(300, TimeUnit.MILLISECONDS); 
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.shutdown();
	}
	
	/**
	 * 设置计划任务调用的线程池
	 * 
	 * @throws InterruptedException 
	 * 
	 * @MethodName: testScheduledThreadPool 
	 * @Description: 
	 * @throws
	 */
	@Test
	public void testScheduledThreadPool() throws InterruptedException{
		// 线程内创建至少poolSize个线程，可以根据业务处理设置处理时间 
		//ScheduledExecutorService继承自ExecutorService
		ScheduledExecutorService  executorService=Executors.newScheduledThreadPool(poolSize);
		executorService.awaitTermination(3000, TimeUnit.MILLISECONDS);
		//ExecutorService executorService=Executors.newScheduledThreadPool(poolSize);
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.shutdown();
	}
	
	/**
	 * 设置计划任务调用的线程池
	 * 
	 * @throws InterruptedException 
	 * 
	 * @MethodName: testScheduledThreadPoolWithThradFactory 
	 * @Description: 
	 * @throws
	 */
	@Test
	public void testScheduledThreadPoolWithThradFactory() throws InterruptedException{
		// 线程内创建至少poolSize个线程，可以根据业务处理设置处理时间 
		//ScheduledExecutorService继承自ExecutorService
		ThreadFactory threadFactory=Executors.defaultThreadFactory();
		ScheduledExecutorService  executorService=Executors.newScheduledThreadPool(poolSize, threadFactory);
		executorService.awaitTermination(3000, TimeUnit.MILLISECONDS);
		//ExecutorService executorService=Executors.newScheduledThreadPool(poolSize);
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.execute(new Task());
		
		executorService.shutdown();
	}
	

}
/**
 * 测试任务线程
 * @package com.boonya.thread.Task
 * @date   2017年4月26日  下午5:51:36
 * @author pengjunlin
 * @comment   
 * @update
 */
class Task implements Runnable {  
    private static volatile int i = 1;  

    @Override  
    public void run() {// 执行任务  
        System.out.println("任务 " + (i++) + " 完成");  
    }  
}  
