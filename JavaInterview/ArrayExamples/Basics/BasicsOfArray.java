package Basics;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class BasicsOfArray {

	//In Java, streams are single-use. Once a terminal operation like forEach(), collect(), sum(), etc., is performed, the stream cannot be used again.


	
	public static void main(String[] args) {
		// Declaration + Allocation
//		int[] input = new int[5];
		
		// initialization
//		input[0] = 10;
//		input[1] = 12;
//		input[2] = 17;
//		input[3] = 15;
//		input[4] = 20;
		
//		Declaration + initialization 
		int[] input = {10, 17, 15, 12, 20};
		
		Arrays.sort(input);
		
		OptionalInt max = Arrays.stream(input).max();
		System.out.println(max.getAsInt());
		System.out.println(Arrays.toString(input));
		
		
//		IntStream stream = Arrays.stream(input);
//
//		stream.forEach(System.out::println);
//		
//		IntPredicate predicate = null;
//		for(int i : input) {
//		predicate = n -> i > 10;
//		}
//		
//		stream.filter(predicate);
		
		IntStream.of(input).forEach(System.out::println);

        // Define predicate
        IntPredicate predicate = n -> n > 10;

        // Filter and print again
        IntStream.of(input)
                 .filter(predicate)
                 .forEach( n -> System.out.println("Values is : " + n)); 
		
        OptionalInt secondLargest = Arrays.stream(input)
        		.distinct()
        		.boxed()
        		.sorted((a, b) -> b - a)
        		.skip(1)
        		.mapToInt(Integer :: intValue)
        		.findFirst();
        
        
        if(secondLargest.isPresent()) {
        	System.out.println("Second Largest Number: " + secondLargest);
        	
        }else {
        	System.out.println("Second Largest Number not found ");
        	
        }
        
	}
	
}
