package Basics;

import java.util.Arrays;
import java.util.OptionalInt;

public class NthLargestInteger {

public static void main(String[] args) {
		
		int[] arr = {10, 73, 47, 50, 28};
		int n = 3;
		
		OptionalInt nthLargest = Arrays.stream(arr)
				.distinct()
				.boxed()
				.sorted((a,b) -> b - a)
				.skip(n-1)
				.mapToInt(Integer :: intValue)
				.findFirst();
		
		if(nthLargest.isPresent()) {
			System.out.println(n +" -th largest number : "+ nthLargest.getAsInt());
		}else {

			System.out.println("There are fewer than " + n + " unique elements.");
		}
				
				
	}
}
