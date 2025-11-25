package MultiThreading;

public class DaemonThread extends Thread {

	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread running..."+ Thread.currentThread().getName());
		}else {
			System.out.println("User Thread running..."+ Thread.currentThread().getName());
			
		}
	}
	public static void main(String[] args) throws InterruptedException{
		DaemonThread d1 = new DaemonThread();
		DaemonThread d2 = new DaemonThread();
		
		d1.setDaemon(true);
		d1.setName("D1");
		d1.start();
		d2.setName("D2");
		d2.setDaemon(true);
		d2.start();
		
		Thread.sleep(2000);
	}
}
