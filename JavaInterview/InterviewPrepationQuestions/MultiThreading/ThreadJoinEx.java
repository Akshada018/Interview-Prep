package MultiThreading;

public class ThreadJoinEx extends Thread {

	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println(Thread.currentThread().getName() + "-" + i);
		}
	}

	public static void main(String[] args) throws InterruptedException {

		ThreadJoinEx j1 = new ThreadJoinEx();
		ThreadJoinEx j2 = new ThreadJoinEx();

		j1.start();
		j1.join();		// j2 will wait for j1 to finish execution
		j2.start();
	}
}


// output -> without join 
//Thread-0-1
//Thread-0-2
//Thread-0-3
//Thread-1-1
//Thread-1-2
//Thread-1-3

// output -> after using join
//Thread-0-1
//Thread-0-2
//Thread-0-3
//Thread-1-1
//Thread-1-2
//Thread-1-3
