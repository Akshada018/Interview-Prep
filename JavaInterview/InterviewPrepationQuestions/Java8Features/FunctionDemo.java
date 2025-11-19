package Java8Features;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer, Integer> doubleIt = x -> x * 2;
		Function<Integer, Integer> tripleIt = x -> x * 3;
		
		System.out.println(doubleIt.apply(10));
		System.out.println(tripleIt.apply(10));
		
		System.out.println(doubleIt.andThen(tripleIt).apply(15));	// first call doubleIt then will call tripleIt on the value got from doubleIt.
		System.out.println(tripleIt.andThen(doubleIt).apply(15));
		System.out.println(doubleIt.compose(tripleIt).apply(15));	// first call tripleIt then will call doubleIt on the value got from tripleIt.
		

		Function<Integer, Integer> identity = Function.identity();
		Integer res = identity.apply(5);
		System.out.println(res);
		
	}

}
