package MultiThreading;

class Counter {
	int count = 0;

	void increment() {
		count++;
	}
}

public class RaceConditionInMultiThreading {
	
	public static void main(String[] args) {
		Counter c = new Counter();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++)
				c.increment();
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++)
				c.increment();
		});

		t1.start(); 	// starts the thread t1
		t2.start(); 	// starts the thread t2
		try {
			
			t1.join(); 			// main thread to wait for complete the execution of t1 thread
			t2.join(); 			// main thread to wait for complete the execution of t2 thread
			System.out.println(c.count);

		} catch (InterruptedException i) {
			i.printStackTrace();
		}
	}

}


// Here we are expecting the output as 2000 but we will not get the output as 2000 because here 2 threads are accessing the same resource i.e., Counter.increment()
// at the same time, this situation is called as race condition. To avoid this situation we can lock the method with synchronized keyword, then we will get 2000 output. 



