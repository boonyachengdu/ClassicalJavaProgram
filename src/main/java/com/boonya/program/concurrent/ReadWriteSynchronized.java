package com.boonya.program.concurrent;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * synchronized关键字修饰的方法是串行执行，性能上很差
 * 
 * @package com.boonya.program.sync.ReadWriteSynchronized
 * @date   2016年12月2日  下午3:36:19
 * @author pengjunlin
 * @comment   
 * @update
 */
public class ReadWriteSynchronized {

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
		/**
		 * 写数据
		 */
		public synchronized void set() {
			System.out.println(Thread.currentThread().getName() + " set:begin "
					+ sdf.format(new Date()));
			try {
				Thread.sleep(5000);
			} catch (Exception e) {

			} finally {
				System.out.println(Thread.currentThread().getName()
						+ " set:end " + sdf.format(new Date()));
			}

		}

		/**
		 * 读数据
		 */
		public synchronized int get() {
			System.out.println(Thread.currentThread().getName()
					+ " get :begin " + sdf.format(new Date()));
			try {
				Thread.sleep(5000);
			} catch (Exception e) {

			} finally {
				System.out.println(Thread.currentThread().getName()
						+ " get :end " + sdf.format(new Date()));
			}
			return 1;
		}
	}

}
