package Java8Features;

import java.util.Arrays;
import java.util.List;

public class SumOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integers = Arrays.asList(2, 3, 6, 82, 76, null);
		
		System.out.println(integers.stream()
				.map(x -> x == null ? 0 : x)	// will handle null
				.reduce(Integer :: sum).get());
	}

}
