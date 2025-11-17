package Basics;

import java.util.Arrays;
import java.util.OptionalInt;

public class SecondLargestInteger {
	
	public static void main(String[] args) {
		
		int[] arr = {};
		
		int secondLargest = Arrays.stream(arr)
				.distinct()
				.boxed()
				.sorted((a,b) -> b - a)
				.skip(1)
				.mapToInt(Integer :: intValue)
				.findFirst().orElse(0);
		
		
			System.out.println("Second largest number : "+ secondLargest);
		
				
				
	}

}
