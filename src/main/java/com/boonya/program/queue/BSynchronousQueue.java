package com.boonya.program.queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

import com.boonya.annotation.ConcurrentQueue;
/**
 * 同步队列
 * 
 * <li>同步队列是特殊的BlockingQueue，对其的操作必须是放和取交替完成的</li>
 * @package com.boonya.program.queue.BSynchronousQueue
 * @date   2016年11月23日  下午2:24:37
 * @author pengjunlin
 * @comment   
 * @update
 */
@ConcurrentQueue
public class BSynchronousQueue extends SynchronousQueue<Object>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8602405932636174597L;

	@Override
	public void put(Object o) throws InterruptedException {
		// TODO Auto-generated method stub
		super.put(o);
	}

	@Override
	public boolean offer(Object o, long timeout, TimeUnit unit)
			throws InterruptedException {
		// TODO Auto-generated method stub
		return super.offer(o, timeout, unit);
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
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return super.isEmpty();
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
	public void clear() {
		// TODO Auto-generated method stub
		super.clear();
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return super.contains(o);
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return super.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return super.containsAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return super.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return super.retainAll(c);
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return super.peek();
	}

	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return super.iterator();
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return super.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return super.toArray(a);
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
	
	

}
