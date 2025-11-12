package MultiThreading;

public class ThreadSleepEx extends Thread{
	
	public void run() {

		for (int i = 1; i <= 3; i++) {
			System.out.println("i = " + i);
			try {
				Thread.sleep(1000);  // pause for 1 second
			} catch (InterruptedException ie) {
				ie.printStackTrace();
				System.out.println(ie);
			}
		}
	}

	public static void main(String[] args) {

		
		new ThreadSleepEx().start();
	}

}
