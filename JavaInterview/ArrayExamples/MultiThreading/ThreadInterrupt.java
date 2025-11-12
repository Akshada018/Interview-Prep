package MultiThreading;

public class ThreadInterrupt extends Thread{
	
	public void run() {
		try {
			Thread.sleep(2000);
			System.out.println("Task completed");
		}catch(Exception e) {
			System.out.println("Thread interrupted!"+ e);
		}
		
	}
	
	public static void main(String[] args) {
		
		ThreadInterrupt t = new ThreadInterrupt();
		
		t.start();
		t.interrupt();
	}

}
