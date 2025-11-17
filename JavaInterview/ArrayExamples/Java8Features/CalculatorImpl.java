package Java8Features;

import java.util.function.Predicate;

public class CalculatorImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c = (a,b) -> a+b;
		System.out.println(c.add(5, 10));

		doWork(() -> System.out.println("Task running..."));
		Predicate<Integer> predicate = x -> x % 2 == 0;
		System.out.println(predicate.test(11));
		System.out.println(predicate.test(10));
	}

	static void doWork(Runnable r) {
		r.run();
	}

}
