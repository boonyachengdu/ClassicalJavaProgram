package com.boonya.program.traps;

import org.junit.Test;
import com.boonya.program.traps.ReadAndWriteConcurrentHashMap;
import com.boonya.program.traps.ReadAndWriteMap;

public class ReadAndWriteMapTest {
	
	private static int clientCount=2;

	@Test
	public void testUnSafeThreadMap(){
		final ReadAndWriteMap cacheManage = new ReadAndWriteMap();
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
	
	@Test
	public void testBetterUnSafeThreadMap(){
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
