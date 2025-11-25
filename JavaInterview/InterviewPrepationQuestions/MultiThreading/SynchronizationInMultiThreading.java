package MultiThreading;

class Counter1 {
	int count = 0;

	synchronized void increment() {
		count++;
	}
}

public class SynchronizationInMultiThreading {

	public static void main(String[] args) {
		Counter1 c = new Counter1();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++)
				c.increment();
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++)
				c.increment();
		});

		t1.start(); // starts the thread t1
		t2.start(); // starts the thread t2
		try {
			t1.join(); // main thread to wait for complete the execution of t1 thread
			t2.join(); // // main thread to wait for complete the execution of t2 thread
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(c.count);
	}
}

// Here we synchronized the increment method that's why t1 and t2 thread will not access the resource i.e., Counter.increment at the same time, 
// so now we will get 2000 as output.




