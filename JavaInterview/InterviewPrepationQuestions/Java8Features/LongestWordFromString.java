package Java8Features;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWordFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "I am learning Streams API in Java";
		
		System.out.println(Arrays.stream(str.split(" "))
				.max(Comparator.comparing(String::length))
				.get());

	}

}
