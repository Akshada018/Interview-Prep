package MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
	
	private final Lock lock = new ReentrantLock();
	
	
	// In this example outerMethod is waiting for innerMethod to release lock and innerMethod is waiting for outerMethod to release its lock, this situation is called deadlock.
//	but here we have used ReentrantLock class so it will not wait for unlock it will try to re enter inside lock. that's why inner lock will acquire the lock again.
//	When we use ReentrantLock that time count is maintain --> how much time lock has been acquired. Each lock call must be paired with unlock call. 
//	if we call unlock two times in innerMethod and also call unlock in outerMethod's finally block then Exception will occur.
	public void outerMethod() {
		lock.lock();
		try {
			System.out.println("Outer Method");
			Thread.sleep(1000);
			innerMethod();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		finally {
			lock.unlock();
		}
	}

	public void innerMethod() {
		lock.lock();
		try {
			System.out.println("Inner Method");
		}finally {
			lock.unlock();
//			lock.unlock();  java.lang.IllegalMonitorStateException will occur
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReentrantLockExample lc = new ReentrantLockExample();
		lc.outerMethod();

	}

}
