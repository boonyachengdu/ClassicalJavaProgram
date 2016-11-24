package com.boonya.program.queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

import com.boonya.annotation.ConcurrentQueue;
/**
 * 链表阻塞队列
 * 
 * <li>链表阻塞队列是大小不定的BlockingQueue，若其构造函数带一个规定大小的参数，生成的BlockingQueue有大小限制，</li>
 * <li>若不带大小参数，所生成的BlockingQueue的大小由Integer.MAX_VALUE来决定。其所含的对象是以FIFO（先入先出）顺序排序的。</li>
 * <li>LinkedBlockingQueue和ArrayBlockingQueue比较起来，它们背后所用的数据结构不一样，导致LinkedBlockingQueue的数据吞吐量要大于ArrayBlockingQueue，但在线程数量很大时其性能的可预见性低于ArrayBlockingQueue。 </li>
 * @package com.boonya.program.queue.BLinkedBlockingQueue
 * @date   2016年11月23日  下午2:11:04
 * @author pengjunlin
 * @comment   
 * @update
 */
@ConcurrentQueue
public class BLinkedBlockingQueue extends LinkedBlockingQueue<Object>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2594367658673389168L;

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
	public boolean offer(Object e) {
		// TODO Auto-generated method stub
		return super.offer(e);
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
	public Object poll() {
		// TODO Auto-generated method stub
		return super.poll();
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return super.peek();
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
