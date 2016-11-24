package com.boonya.program.queue;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
/**
 * 参考地址：http://www.cnblogs.com/jobs/archive/2007/04/27/730255.html
 * 
 * @package com.boonya.program.queue.DelayQueueTest
 * @date   2016年11月23日  下午4:56:43
 * @author pengjunlin
 * @comment   
 * @update
 */
public class DelayQueueTest {

	public class Pair<K, V> {
		public K first;

		public V second;

		public Pair() {
		}

		public Pair(K first, V second) {
			this.first = first;
			this.second = second;
		}
	}

	public class DelayItem<T> implements Delayed {
		/** Base of nanosecond timings, to avoid wrapping */
		private final long NANO_ORIGIN = System.nanoTime();

		/**
		 * Returns nanosecond time offset by origin
		 */
		final long now() {
			return System.nanoTime() - NANO_ORIGIN;
		}

		/**
		 * Sequence number to break scheduling ties, and in turn to guarantee
		 * FIFO order among tied entries.
		 */
		private final AtomicLong sequencer = new AtomicLong(0);

		/** Sequence number to break ties FIFO */
		private final long sequenceNumber;

		/** The time the task is enabled to execute in nanoTime units */
		private final long time;

		private final T item;

		public DelayItem(T submit, long timeout) {
			this.time = now() + timeout;
			this.item = submit;
			this.sequenceNumber = sequencer.getAndIncrement();
		}

		public T getItem() {
			return this.item;
		}

		public long getDelay(TimeUnit unit) {
			long d = unit.convert(time - now(), TimeUnit.NANOSECONDS);
			return d;
		}

		public int compareTo(Delayed other) {
			if (other == this) // compare zero ONLY if same object
				return 0;
			if (other instanceof DelayItem) {
				@SuppressWarnings("rawtypes")
				DelayItem x = (DelayItem) other;
				long diff = time - x.time;
				if (diff < 0)
					return -1;
				else if (diff > 0)
					return 1;
				else if (sequenceNumber < x.sequenceNumber)
					return -1;
				else
					return 1;
			}
			long d = (getDelay(TimeUnit.NANOSECONDS) - other
					.getDelay(TimeUnit.NANOSECONDS));
			return (d == 0) ? 0 : ((d < 0) ? -1 : 1);
		}

	}

	public class Cache<K, V> {
		private final Logger LOG = Logger.getLogger(Cache.class
				.getName().toString());

		private ConcurrentMap<K, V> cacheObjMap = new ConcurrentHashMap<K, V>();

		private DelayQueue<DelayItem<Pair<K, V>>> q = new DelayQueue<DelayItem<Pair<K, V>>>();

		private Thread daemonThread;

		public Cache() {

			Runnable daemonTask = new Runnable() {
				public void run() {
					daemonCheck();
				}
			};

			daemonThread = new Thread(daemonTask);
			daemonThread.setDaemon(true);
			daemonThread.setName("Cache Daemon");
			daemonThread.start();
		}

		private void daemonCheck() {

			if (LOG.isLoggable(Level.INFO))
				LOG.info("cache service started.");

			for (;;) {
				try {
					DelayItem<Pair<K, V>> delayItem = q.take();
					if (delayItem != null) {
						// 超时对象处理
						Pair<K, V> pair = delayItem.getItem();
						cacheObjMap.remove(pair.first, pair.second); // compare
																		// and
																		// remove
					}
				} catch (InterruptedException e) {
					if (LOG.isLoggable(Level.SEVERE))
						LOG.log(Level.SEVERE, e.getMessage(), e);
					break;
				}
			}

			if (LOG.isLoggable(Level.INFO))
				LOG.info("cache service stopped.");
		}

		// 添加缓存对象
		public void put(K key, V value, long time, TimeUnit unit) {
			V oldValue = cacheObjMap.put(key, value);
			if (oldValue != null)
				q.remove(key);

			long nanoTime = TimeUnit.NANOSECONDS.convert(time, unit);
			q.put(new DelayItem<Pair<K, V>>(new Pair<K, V>(key, value),
					nanoTime));
		}

		public V get(K key) {
			return cacheObjMap.get(key);
		}

	}

	@Test
	public void test() {
		Cache<Integer, String> cache = new Cache<Integer, String>();
		cache.put(1, "aaaa", 3, TimeUnit.SECONDS);

		try {
			Thread.sleep(1000 * 2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		{
			String str = cache.get(1);
			System.out.println(str);
		}

		try {
			Thread.sleep(1000 * 10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		{
			String str = cache.get(1);
			System.out.println(str);
		}
	}

}
