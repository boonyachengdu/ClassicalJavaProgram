package com.boonya.program.queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

import com.boonya.annotation.ConcurrentQueue;
/**
 * 数组阻塞队列
 * 
 * <li>数组阻塞队列是规定大小的BlockingQueue，其构造函数必须带一个int参数来指明其大小。其所含的对象是以FIFO（先入先出）顺序排序的。 </li>
 * @package com.boonya.program.queue.BArrayBlockingQueue
 * @date   2016年11月23日  下午2:08:56
 * @author pengjunlin
 * @comment   
 * @update
 */
@ConcurrentQueue
public class BArrayBlockingQueue extends ArrayBlockingQueue<Object> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4370986952809718196L;

	public BArrayBlockingQueue(int capacity) {
		super(capacity);
		// TODO Auto-generated constructor stub
	}
	
	
	public BArrayBlockingQueue(int capacity,boolean fair) {
		super(capacity, fair);
		// TODO Auto-generated constructor stub
	}
	
	public BArrayBlockingQueue(int capacity,boolean fair,Collection collection) {
		super(capacity, fair,collection);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return super.add(e);
	}

	@Override
	public boolean offer(Object e) {
		// TODO Auto-generated method stub
		return super.offer(e);
	}

	@Override
	public void put(Object e) throws InterruptedException {
		// TODO Auto-generated method stub
		super.put(e);
	}

	@Override
	public boolean offer(Object e, long timeout, TimeUnit unit)
			throws InterruptedException {
		// TODO Auto-generated method stub
		return super.offer(e, timeout, unit);
	}

	@Override
	public Object poll() {
		// TODO Auto-generated method stub
		return super.poll();
	}

	@Override
	public Object take() throws InterruptedException {
		// TODO Auto-generated method stub
		return super.take();
	}

	@Override
	public Object poll(long timeout, TimeUnit unit) throws InterruptedException {
		// TODO Auto-generated method stub
		return super.poll(timeout, unit);
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return super.peek();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return super.size();
	}

	@Override
	public int remainingCapacity() {
		// TODO Auto-generated method stub
		return super.remainingCapacity();
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return super.remove(o);
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return super.contains(o);
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return super.toArray();
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return super.toArray(a);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		super.clear();
	}

	@Override
	public int drainTo(Collection c) {
		// TODO Auto-generated method stub
		return super.drainTo(c);
	}

	@Override
	public int drainTo(Collection c, int maxElements) {
		// TODO Auto-generated method stub
		return super.drainTo(c, maxElements);
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return super.iterator();
	}
	
	

}
