package MultiThreading;

public class ThreadMethods_Run extends Thread {
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String [] args) {
		
		ThreadMethods_Run tm = new ThreadMethods_Run();
		
		tm.run();
		tm.start();
		System.out.println(tm.currentThread().getName());
		
	}
}

// output
//main         - from tm.run()
//main         - from System.out.println(...)
//Thread-0     - from tm.start()