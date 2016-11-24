package com.boonya.thread;

import java.util.concurrent.BlockingQueue;
import com.sun.jmx.snmp.tasks.Task;

public class InterruptTaskRunner implements Runnable {  
	
    private BlockingQueue<Task> queue;  
  
    public InterruptTaskRunner(BlockingQueue<Task> queue) {   
        this.queue = queue;   
    }  
  
    public void run() {   
        try {  
             while (true) {  
                 Task task = queue.take();  
                 task.run();
             }  
         }  
         catch (InterruptedException e) {   
             // Restore the interrupted status  
             Thread.currentThread().interrupt();  
         }  
    }  

}
