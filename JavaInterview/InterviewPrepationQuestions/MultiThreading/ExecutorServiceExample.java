package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		ExecutorService executorService = Executors.newSingleThreadExecutor();
		 Future<Integer> future = executorService.submit(() -> {
				try {
					Thread.sleep(2000);
				}catch(InterruptedException e) {
					System.out.println("Exception occured : "+ e);
				}
				
				System.out.println("Hello");
				return 42;
		});
		
		Thread.sleep(2000);
		future.cancel(false);
		System.out.println(future.isCancelled());
		System.out.println(future.isDone());
		executorService.shutdown();
	}

}
