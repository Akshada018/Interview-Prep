package Java8Features;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "dabcadefg";
//		target = dabcefg
		
		IntStream arr = s.chars();
		
//		Way 1
//		arr.distinct().mapToObj(x -> (char) x).forEach(System.out :: print);
		 
//		Way 2
		System.out.println(Arrays.stream(s.split("")).distinct().collect(Collectors.joining()));
				
	}

}
