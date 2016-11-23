package com.boonya.program.skills;

import org.junit.Test;
import com.boonya.program.skills.ReadAndWriteConcurrentHashMap;

public class ReadAndWriteMapTest {
	
	private static int clientCount=2;
	
	@Test
	public void testSafeThreadMap(){
		final ReadAndWriteConcurrentHashMap cacheManage = new ReadAndWriteConcurrentHashMap();
		Thread[] threads = new Thread[ReadAndWriteMapTest.clientCount];
		for (int i = 0; i < ReadAndWriteMapTest.clientCount; i++) {
			threads[i] = new Thread(new Runnable() {
				public void run() {
					for (int i = 0; i < 10; i++) {
						cacheManage.put("a", i + 1 + "");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						cacheManage.get("a");
					}
				}
			});
			threads[i].start();
		}
		
		// 保持主线程存活
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
