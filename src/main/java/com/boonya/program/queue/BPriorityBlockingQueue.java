package com.boonya.program.queue;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

import com.boonya.annotation.ConcurrentQueue;
/**
 * 优先次序阻塞队列
 * 
 * <li>优先次序阻塞队列类似于LinkedBlockingQueue，但其所含对象的排序不是FIFO(先进先出)，而是依据对象的自然排序顺序或者是构造函数所带的Comparator决定的顺序。 </li>
 * @package com.boonya.program.queue.BPriorityBlockingQueue
 * @date   2016年11月23日  下午2:17:02
 * @author pengjunlin
 * @comment   
 * @update
 */
@ConcurrentQueue
public class BPriorityBlockingQueue extends PriorityBlockingQueue<Object>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5419903598596871715L;

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
	public void put(Object e) {
		// TODO Auto-generated method stub
		super.put(e);
	}

	@Override
	public boolean offer(Object e, long timeout, TimeUnit unit) {
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
	public Comparator<? super Object> comparator() {
		// TODO Auto-generated method stub
		return super.comparator();
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
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public int drainTo(Collection<? super Object> c) {
		// TODO Auto-generated method stub
		return super.drainTo(c);
	}

	@Override
	public int drainTo(Collection<? super Object> c, int maxElements) {
		// TODO Auto-generated method stub
		return super.drainTo(c, maxElements);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		super.clear();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return super.toArray(a);
	}

	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return super.iterator();
	}
	
	

}
