package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long startTime = System.currentTimeMillis();
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		for(int i = 1; i < 10; i++) {
			int finalI = i;
			executor.submit(() -> {
				long result = factorial(finalI);
			System.out.println(result);
			});
		}
		
		executor.shutdown();
		try {
			executor.awaitTermination(5, TimeUnit.SECONDS);
		}catch(InterruptedException e) {
			throw new RuntimeException();
		}
		
		System.out.println("Total time: "+ (System.currentTimeMillis() - startTime));
	}
	
	public static long factorial(int n){
		try {
			Thread.sleep(1000);
			
		}catch(InterruptedException e) {
			throw new RuntimeException();
		}
		
		long result = 1;
		for(int i = 1; i < n; i++) {
			result *= i;
		}
		
		return result;
	}

}
