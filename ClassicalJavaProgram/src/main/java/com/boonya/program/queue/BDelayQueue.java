package com.boonya.program.queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import com.boonya.annotation.ConcurrentQueue;
/**
 * 延时队列DelayQueue
 * 
 * <li>DelayQueue是一个BlockingQueue，其特化的参数是Delayed。</li>
 * <li>Delayed扩展了Comparable接口，比较的基准为延时的时间值，Delayed接口的实现类getDelay的返回值应为固定值（final）。DelayQueue内部是使用PriorityQueue实现的。</li>
 * <li>DelayQueue是一个使用优先队列（PriorityQueue）实现的BlockingQueue，优先队列的比较基准值是时间。</li>
 * @package com.boonya.program.queue.BDelayQueue
 * @date   2016年11月23日  下午4:25:57
 * @author pengjunlin
 * @comment   
 * @update
 */
@ConcurrentQueue
public class BDelayQueue extends DelayQueue<Delayed>{

	@Override
	public boolean add(Delayed e) {
		// TODO Auto-generated method stub
		return super.add(e);
	}

	@Override
	public boolean offer(Delayed e) {
		// TODO Auto-generated method stub
		return super.offer(e);
	}

	@Override
	public void put(Delayed e) {
		// TODO Auto-generated method stub
		super.put(e);
	}

	@Override
	public boolean offer(Delayed e, long timeout, TimeUnit unit) {
		// TODO Auto-generated method stub
		return super.offer(e, timeout, unit);
	}

	@Override
	public Delayed poll() {
		// TODO Auto-generated method stub
		return super.poll();
	}

	@Override
	public Delayed take() throws InterruptedException {
		// TODO Auto-generated method stub
		return super.take();
	}

	@Override
	public Delayed poll(long timeout, TimeUnit unit)
			throws InterruptedException {
		// TODO Auto-generated method stub
		return super.poll(timeout, unit);
	}

	@Override
	public Delayed peek() {
		// TODO Auto-generated method stub
		return super.peek();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return super.size();
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
	public void clear() {
		// TODO Auto-generated method stub
		super.clear();
	}

	@Override
	public int remainingCapacity() {
		// TODO Auto-generated method stub
		return super.remainingCapacity();
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
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return super.remove(o);
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return super.iterator();
	}
	
	

}
