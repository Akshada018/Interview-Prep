package MultiThreading;

public class TestThread {

	public static void main(String [] args) {
		
		// When Extending Thread Class
//		MultiThreadingByThread mt = new MultiThreadingByThread();
//		
//		mt.start();
		
		
		// When Implementing Runnable interface
		
		MultiThreadingByRunnable mtr = new MultiThreadingByRunnable();
		
		Thread t = new Thread(mtr);
		
		t.start();
		
		for(; ;) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
