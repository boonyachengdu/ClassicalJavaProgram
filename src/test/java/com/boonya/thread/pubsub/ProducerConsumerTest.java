package com.boonya.thread.pubsub;

import org.junit.Test;
/**
 * 测试多种资源示例
 * 
 * @package com.boonya.thread.pubsub.ProducerConsumerTest
 * @date   2017年3月20日  下午4:14:03
 * @author pengjunlin
 * @comment   
 * @update
 */
public class ProducerConsumerTest {
	
	/**
	 * 一对一线程处理
	 * 
	 * @MethodName: test 
	 * @Description: 
	 * @throws InterruptedException
	 * @throws
	 */
	@Test
	public void test() throws InterruptedException{
		Resource resource = new Resource();
        new Thread(new Producer(resource)).start();//生产者线程
        new Thread(new Consumer(resource)).start();//消费者线程
         
        Thread.sleep(3000);
	}
	
	/**
	 * 多对多线程处理
	 * 
	 * @MethodName: test2 
	 * @Description: 
	 * @throws InterruptedException
	 * @throws
	 */
	@Test
	public void test2() throws InterruptedException{
		Resource resource = new Resource();
        new Thread(new Consumer(resource)).start();//生产者线程
        new Thread(new Consumer(resource)).start();//生产者线程
        new Thread(new Producer(resource)).start();//消费者线程
        new Thread(new Producer(resource)).start();//消费者线程
		
		Thread.sleep(3000);
	}

}
