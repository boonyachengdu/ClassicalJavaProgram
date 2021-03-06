package com.boonya.program.traps;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.boonya.annotation.UnSafeThread;
/**
 * 非线程安全的Map读写操作：同步块未覆盖到所有场景。
 * 
 * <li>总结：读时不能写 写时不能读  可以并发读  不能并发写</li>
 * 
 * @package com.boonya.program.traps.ReadAndWriteConcurrentHashMap
 * @date   2016年11月22日  下午2:38:36
 * @author pengjunlin
 * @comment   
 * @update
 */
@UnSafeThread
public class ReadAndWriteConcurrentHashMap {

	// ConcurrentHashMaps虽然是线程安全的但是外部操作也需要同步读写才能保证一致性
	private Map<String, String> cache = new ConcurrentHashMap<String, String>();

	public void fresh() {
		synchronized (cache) {
			cache.clear();
		}
	}

	public void put(String key, String value) {
		synchronized (cache) {
			cache.put(key, value);
			System.out.println(Thread.currentThread().getName()
					+ "  cache.put--------" + value);
		}
	}

	public String get(String key) {
		System.out.println(Thread.currentThread().getName()
				+ "  cache.get-----" + cache.get(key));
		return cache.get(key);
	}

}
