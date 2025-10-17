/*
 * ReentrantLock (tryLock())
 * CountDownLatch
 * CyclicBarrier
 * Semaphore
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lock lock=new ReentrantLock();
		lock.lock();
		/*
		 * 
		 * 
		 */
		lock.unlock();
	
	
	}

}
