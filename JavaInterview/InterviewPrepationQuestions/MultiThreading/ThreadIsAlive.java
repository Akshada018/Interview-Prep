package MultiThreading;

public class ThreadIsAlive extends Thread{

	public void run() {
		System.out.println("Thread is running...");
	}
	
	public static void main(String[] args) {
		ThreadIsAlive ti = new ThreadIsAlive();
		System.out.println("Before start : "+ ti.isAlive());
		
		ti.start();
		System.out.println("After start : "+ ti.isAlive());
		
	}
}
