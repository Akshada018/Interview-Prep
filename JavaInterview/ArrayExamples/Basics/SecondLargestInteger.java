package Basics;

import java.util.Arrays;
import java.util.OptionalInt;

public class SecondLargestInteger {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 73, 47, 50, 28};
		
		OptionalInt secondLargest = Arrays.stream(arr)
				.distinct()
				.boxed()
				.sorted((a,b) -> b - a)
				.skip(1)
				.mapToInt(Integer :: intValue)
				.findFirst();
		
		if(secondLargest.isPresent()) {
			System.out.println("Second largest number : "+ secondLargest.getAsInt());
		}else {
			System.out.println("Second largest number not found");
			
		}
				
				
	}

}
