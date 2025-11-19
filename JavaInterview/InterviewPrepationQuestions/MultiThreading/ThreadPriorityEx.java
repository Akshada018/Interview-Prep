package MultiThreading;

public class ThreadPriorityEx extends Thread{

	public void run() {
		System.out.println("Thread running with priority : "+ getPriority());
	}
	
	public static void main(String[] args) {
		ThreadPriorityEx tp = new ThreadPriorityEx();
		tp.setPriority(MIN_PRIORITY);
		tp.setPriority(MAX_PRIORITY);
		tp.setPriority(NORM_PRIORITY);
		tp.start();
	}
	
}
