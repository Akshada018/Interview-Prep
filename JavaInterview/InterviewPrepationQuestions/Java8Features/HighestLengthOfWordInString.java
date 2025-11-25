package Java8Features;

import java.util.Arrays;
import java.util.Comparator;

public class HighestLengthOfWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am learning Streams API in Java";

//		Way 1
		int len = Arrays.stream(str.split(" ")).map(x -> x.length()).sorted(Comparator.reverseOrder()).skip(0).findFirst().get();
		
		System.out.println("Highest length : "+len);
//		Way 2
		System.out.println("Highest length: "+ Arrays.stream(str.split(" ")).sorted((a, b) -> Integer.compare(b.length(), a.length()))
				.skip(0).findFirst().get().length());
		
		
	}

}
