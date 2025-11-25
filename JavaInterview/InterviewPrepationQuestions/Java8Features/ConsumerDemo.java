package Java8Features;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer<Integer> print = (x) -> System.out.println(x);
		print.accept(25);
		
		Supplier<String> s = () -> "Hello world";
		System.out.println(s.get()); 
	}

}
