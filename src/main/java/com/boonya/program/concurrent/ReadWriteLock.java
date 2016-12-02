package com.boonya.program.concurrent;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/**
 * ReentrantReadWriteLock可重入读写锁
 * 
 * <li>写锁只允许一个线程进行数据修改操作，读锁允许多个线程共同读取资源</li>
 * @package com.boonya.program.sync.ReadWriteLock
 * @date   2016年12月2日  下午3:37:44
 * @author pengjunlin
 * @comment   
 * @update
 */
public class ReadWriteLock {

	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public static void main(String[] args) throws Exception {
		Data data = new Data();
		Worker t1 = new Worker(data, true, "t1");
		Worker t2 = new Worker(data, true, "t2");
		t1.start();
		t2.start();
	}

	/**
	 * 工作线程类
	 */
	static class Worker extends Thread {
		Data data;
		boolean read;

		public Worker(Data data, boolean read, String threadName) {
			super(threadName);
			this.data = data;
			this.read = read;
		}

		public void run() {
			if (read)
				data.get();
			else
				data.set();
		}
	}

	/**
	 * 数据类
	 */
	static class Data {
		ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
		Lock read = lock.readLock();
		Lock write = lock.writeLock();

		/**
		 * 写数据
		 */
		public void set() {
			write.lock();
			System.out.println(Thread.currentThread().getName() + " set:begin "
					+ sdf.format(new Date()));
			try {
				Thread.sleep(5000);
			} catch (Exception e) {

			} finally {
				System.out.println(Thread.currentThread().getName()
						+ " set:end " + sdf.format(new Date()));
				write.unlock();
			}

		}

		/**
		 * 读数据
		 */
		public int get() {
			read.lock();
			System.out.println(Thread.currentThread().getName()
					+ " get :begin " + sdf.format(new Date()));
			try {
				Thread.sleep(5000);
			} catch (Exception e) {

			} finally {
				System.out.println(Thread.currentThread().getName()
						+ " get :end " + sdf.format(new Date()));
				read.unlock();
			}
			return 1;
		}
	}

}
