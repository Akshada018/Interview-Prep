package MultiThreading;

import java.util.concurrent.locks.ReentrantLock;

public class TryLockDemo {

	private final ReentrantLock lock = new ReentrantLock();

	void doTask() {
		if (lock.tryLock()) {
			try {
				System.out.println(Thread.currentThread().getName() + " acquired the lock");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				lock.unlock();
			}

		} else {
			System.out
					.println(Thread.currentThread().getName() + " couldn't acquired the lock, doing something else...");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryLockDemo obj = new TryLockDemo();
		new Thread(obj::doTask, "T1").start();
		new Thread(obj::doTask, "T2").start();

		
	}

}
