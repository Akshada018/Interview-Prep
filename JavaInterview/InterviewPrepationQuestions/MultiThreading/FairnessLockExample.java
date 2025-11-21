package MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairnessLockExample {

	private final Lock lock = new ReentrantLock(true);

	public void accessResource() {
		lock.lock();
		try {
			System.out.println(Thread.currentThread().getName() + " acquired the lock");
			Thread.sleep(1000);

		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		} finally {
			System.out.println(Thread.currentThread().getName() + " released the lock"); // to print it before unlocking
																							// the thread
			lock.unlock();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FairnessLockExample fl = new FairnessLockExample();
		Runnable task = new Runnable() {
			@Override
			public void run() {
				fl.accessResource();
			}
		};

		Thread t1 = new Thread(task, "Thread-1");
		Thread t2 = new Thread(task, "Thread-2");
		Thread t3 = new Thread(task, "Thread-3");
//		try {
			t1.start();
//			Thread.sleep(50);	// Add if we want order like t1,t2,t3
			t2.start();
//			Thread.sleep(50);
			t3.start();
//		} catch (InterruptedException e) {
//			Thread.currentThread().interrupt();
//		}
	}

//	Output while using private final Lock lock = new ReentrantLock(); --> will not execute in order anyway but 
//	also some threads may not be get chance to access the resource/acquire lock this situation is called as starvation. 
//	To prevent it we can use it true in constructor while creating object of ReentrantLock like below --> 
//	so all threads will get same chance to access the resource.
//	By using below fairness can be achieve means we will get it in the same order in which you request it(In FIFO Manner).
//	private final Lock lock = new ReentrantLock(true);

	// Thread-2 acquired the lock
//	Thread-2 released the lock
//	Thread-3 acquired the lock
//	Thread-3 released the lock
//	Thread-1 acquired the lock
//	Thread-1 released the lock

}
