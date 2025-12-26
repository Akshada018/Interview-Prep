package Java8Features;

import java.util.Arrays;

public class ReverseStringUsingStream {

	public static void main(String[] args) {
		String s = "Programming";
		
		System.out.println(Arrays.stream(s.split("")).map(x -> new StringBuilder(s).reverse())
				.findFirst().get());
//				.collect(Collectors.joining()));
	}
	
	
}
