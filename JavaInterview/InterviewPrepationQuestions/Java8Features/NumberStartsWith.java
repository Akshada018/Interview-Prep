package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(1,28,11,129,150,39,90,1257,190);

		System.out.println(numbers.stream().filter(x -> String.valueOf(x).startsWith("1")).collect(Collectors.toList()));
	}

}
