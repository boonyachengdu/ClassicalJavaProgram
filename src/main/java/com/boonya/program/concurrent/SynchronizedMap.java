package com.boonya.program.concurrent;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class SynchronizedMap<K, V> implements Map<K, V>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6922086292708616214L;
	
	private final Map<K, V> m; // Backing Map
	
	final Object mutex; // Object on which to synchronize

	SynchronizedMap(Map<K, V> m) {
		if (m == null)
			throw new NullPointerException();
		this.m = m;
		mutex = this;
	}

	SynchronizedMap(Map<K, V> m, Object mutex) {
		this.m = m;
		this.mutex = mutex;
	}

	public int size() {
		synchronized (mutex) {
			return m.size();
		}
	}

	public boolean isEmpty() {
		synchronized (mutex) {
			return m.isEmpty();
		}
	}

	public boolean containsKey(Object key) {
		synchronized (mutex) {
			return m.containsKey(key);
		}
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V put(K key, V value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> m) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public Set<K> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<V> values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<java.util.Map.Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

}
