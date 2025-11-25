package MultiThreading;

public class GetOrSetName extends Thread{

	public void run() {
		System.out.println(Thread.currentThread().getName());	// Akshada's Thread
		
	}
	
	public static void main(String[] args) {
		
		GetOrSetName gs = new GetOrSetName();
		System.out.println(gs.currentThread().getName()); 		// main
		gs.start();
		gs.setName("Akshada's Thread");
//		gs.start(); 		// this will not work as thread can be started only once. *Once a thread finishes (TERMINATED state), it cannot be restarted.
	}
	
}
