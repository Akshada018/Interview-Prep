package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SquaringAndSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(2, 4, 6, 8);
		
		List<Integer> squaredAndSortedNumber = numbers
				.stream()
				.filter(Objects :: nonNull)	// to handle null Or can use .map(n -> Optional.ofNullable(n).orElse(0))
				.map(x -> x*x)
				.sorted()
				.collect(Collectors.toList());
		System.out.println(squaredAndSortedNumber);
		
		

	}

}
