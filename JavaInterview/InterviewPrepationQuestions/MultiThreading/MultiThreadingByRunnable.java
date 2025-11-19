package MultiThreading;

public class MultiThreadingByRunnable implements Runnable{
	
	@Override
	public void run() {
		for(; ;) {
			System.out.println(Thread.currentThread().getName());
		}
	}

}
