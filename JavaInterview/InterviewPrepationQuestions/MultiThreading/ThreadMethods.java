package MultiThreading;

public class ThreadMethods extends Thread {
	
	public void run() {
		System.out.println("Thread is running...");
	}
	
	public static void main(String [] args) {
		
		ThreadMethods tm = new ThreadMethods();
		System.out.println("Thread Id : "+ tm.getId());
		
		tm.start();
		
		System.out.println("Main thread running....");
	}

}
