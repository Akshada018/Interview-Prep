package Java8Features;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseStringUsingStream {

	public static void main(String[] args) {
		String s = "Programming";
		
		System.out.println(Arrays.stream(s.split("")).map(x -> new StringBuilder(s).reverse())
				.findFirst().get());
//				.collect(Collectors.joining()));
		
		String str = "I love my india";
		
		System.out.println(Arrays.stream(str.split(" ")).map(x -> new StringBuilder(x).reverse()).collect(Collectors.joining(" ")));
	}
	
	
}
