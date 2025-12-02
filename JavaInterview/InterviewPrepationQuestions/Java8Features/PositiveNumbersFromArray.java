package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumbersFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {-12, -10, 8, -65, 13, 56};
		
		List<Integer> list = Arrays.asList(-12, -10, 8, -65, 13, 56);

//		System.out.println(list.stream().map(x -> x > 0).collect(Collectors.toList()));  will return true false for positive & negative numbers
		System.out.println(Arrays.stream(arr).filter(x -> x > 0).boxed().collect(Collectors.toList()));
		
		
		
	}

}
