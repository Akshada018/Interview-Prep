package MultiThreading;

public class CurrentThread {

	public static void main(String[] args) {
		Thread t = new Thread();
		System.out.println(t.currentThread().getName());	// main
		
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName());	// main
		
	}
}
