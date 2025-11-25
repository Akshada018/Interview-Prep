package MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SharedResource{
	
	private final Lock lock = new ReentrantLock();
	
	void printMessage(String message) {
		lock.lock();		// acquires the lock
		try {
			System.out.println(Thread.currentThread().getName() + " -> "+ message);
			Thread.sleep(500);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}finally {
			lock.unlock();   // releases the lock of thread
		}
	}
}

public class LockExample {
	
	public static void main(String[] args) {
		SharedResource resource = new SharedResource();
		
		Thread t1 = new Thread(() -> resource.printMessage("Hello"));
		Thread t2 = new Thread(() -> resource.printMessage("Akshada"));
		
		t1.start();
		t2.start();
	}

}
