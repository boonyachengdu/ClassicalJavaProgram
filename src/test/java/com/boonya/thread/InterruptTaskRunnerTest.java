package com.boonya.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.junit.Test;
import com.sun.jmx.snmp.tasks.Task;

public class InterruptTaskRunnerTest {
	
	private static BlockingQueue<Task> queue=new LinkedBlockingQueue<Task>();
	
	@Test
	public void testInterrupt(){
		
		Task task=new Task() {
			
			public void run() {
				System.out.println("Counting task num="+InterruptTaskRunnerTest.queue.size()); 
				InterruptTaskRunnerTest.queue.poll();
				// TODO Auto-generated method stub
				System.out.println("Task has run completed!"); 
				System.out.println("Counting task num="+InterruptTaskRunnerTest.queue.size()); 
			}
			
			public void cancel() {
				// TODO Auto-generated method stub
				System.out.println("Task was canceled!"); 
			}
		};
		queue.add(task);
		InterruptTaskRunner runner=new InterruptTaskRunner(queue);
		Thread thread=new Thread(runner);
		thread.start();
		
	}

}
