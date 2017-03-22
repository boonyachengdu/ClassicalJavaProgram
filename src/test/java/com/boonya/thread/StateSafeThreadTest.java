package com.boonya.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
/**
 * 状态安全线程测试类
 * 
 * @package com.boonya.thread.StateSafeThreadTest
 * @date   2017年3月22日  下午4:41:37
 * @author pengjunlin
 * @comment   
 * @update
 */
public class StateSafeThreadTest {
	
	/**
	 * 线程安全的
	 * 
	 * @MethodName: testByOneThread 
	 * @Description: 
	 * @throws
	 */
	@Test
	public void testByOneThread(){
		
		for (int i = 0; i < 5; i++) {
			Thread thread=new StateSafeThread();
			thread.start();
		}
		
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 线程安全的
	 * 
	 * @MethodName: testByThreadPool 
	 * @Description: 
	 * @throws
	 */
	@Test
	public void testByThreadPool(){
		Thread thread=null;
		ExecutorService executorService=Executors.newFixedThreadPool(5);// 线程个数大于或等于线程个数时线程安全
		
		for (int i = 0; i < 5; i++) {
			thread=new StateSafeThread();
			executorService.execute(thread);
		}
		/*Future future=executorService.submit(thread);
		
		try {
			System.out.println(future.get());
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ExecutionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		
		try {
			executorService.awaitTermination(30000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			executorService.shutdown();
		}
		
	}
	
	/**
	 * 非线程安全的
	 * 
	 * @MethodName: testByThreadPool2 
	 * @Description: 
	 * @throws
	 */
	@Test
	public void testByThreadPool2(){
		Thread thread=null;
		ExecutorService executorService=Executors.newFixedThreadPool(3);// 小于线程个数导致线程不安全
		
		
		for (int i = 0; i < 5; i++) {
			thread=new StateSafeThread();
			executorService.execute(thread);
		}
		/*Future future=executorService.submit(thread);
		
		try {
			System.out.println(future.get());
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ExecutionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/

		try {
			executorService.awaitTermination(30000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			executorService.shutdown();
		}
		
	}
	
	/**
	 * 线程安全的
	 * 
	 * @MethodName: testByThreadPool3
	 * @Description: 
	 * @throws
	 */
	@Test
	public void testByThreadPool3(){
		Thread thread=null;
		ExecutorService executorService=Executors.newCachedThreadPool();
		
		
		for (int i = 0; i < 5; i++) {
			thread=new StateSafeThread();
			executorService.execute(thread);
		}
		/*Future future=executorService.submit(thread);
		
		try {
			System.out.println(future.get());
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ExecutionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/

		try {
			executorService.awaitTermination(30000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			executorService.shutdown();
		}
		
	}

}
