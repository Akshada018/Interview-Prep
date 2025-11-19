package MultiThreading;

public class ThreadYeild extends Thread{

	public void run() {
		 for(int i=1; i<=3; i++) {
			 Thread.yield();		// hint to scheduler
			 System.out.println(Thread.currentThread().getName() + "-"+i);
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadYeild t1 = new ThreadYeild();
		ThreadYeild t2 = new ThreadYeild();

		t1.start();
		t2.start();
	}

}
