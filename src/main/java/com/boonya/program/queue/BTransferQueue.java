package com.boonya.program.queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import com.boonya.annotation.ConcurrentQueue;
/**
 * TransferQueue
 * 
 * <li>TransferQueue是JDK1.7 java.util.concurrent提供的一个接口而不是实现。它的一种实现是LinkedTransferQueue</li>
 * @package com.boonya.program.queue.BTransferQueue
 * @date   2016年11月23日  下午4:37:11
 * @author pengjunlin
 * @comment   
 * @update
 */
@ConcurrentQueue
public class BTransferQueue extends LinkedTransferQueue<Object>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5672476611350061995L;

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
	public boolean offer(Object e) {
		// TODO Auto-generated method stub
		return super.offer(e);
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return super.add(e);
	}

	@Override
	public boolean tryTransfer(Object e) {
		// TODO Auto-generated method stub
		return super.tryTransfer(e);
	}

	@Override
	public void transfer(Object e) throws InterruptedException {
		// TODO Auto-generated method stub
		super.transfer(e);
	}

	@Override
	public boolean tryTransfer(Object e, long timeout, TimeUnit unit)
			throws InterruptedException {
		// TODO Auto-generated method stub
		return super.tryTransfer(e, timeout, unit);
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

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return super.peek();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return super.isEmpty();
	}

	@Override
	public boolean hasWaitingConsumer() {
		// TODO Auto-generated method stub
		return super.hasWaitingConsumer();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return super.size();
	}

	@Override
	public int getWaitingConsumerCount() {
		// TODO Auto-generated method stub
		return super.getWaitingConsumerCount();
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
	public int remainingCapacity() {
		// TODO Auto-generated method stub
		return super.remainingCapacity();
	}
	
	

}
