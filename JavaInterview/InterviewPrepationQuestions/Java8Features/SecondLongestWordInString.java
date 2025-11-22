package Java8Features;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SecondLongestWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "I am learning Streams API in Java";

		System.out.println(Arrays.stream(str.split(" ")).sorted((a,b) -> Integer.compare(b.length(), a.length())).skip(1).findFirst().get());
		
	}


}
