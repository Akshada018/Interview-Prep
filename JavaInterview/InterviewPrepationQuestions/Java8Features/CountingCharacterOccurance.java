package Java8Features;

import java.util.Arrays;
import java.util.List;

public class CountingCharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World";
		
//		System.out.println(s.chars().filter(x -> x == 'l').count());
		
		
		// find count of occurrence of what
		String string = "What is your name what is this what is your lastname";
		
		String [] array = string.split(" ");
		
//		for (String string2 : array) {
//			System.out.println(string2);
//		}
		
		System.out.println(Arrays.asList(array).stream()
				.filter(x -> x.equalsIgnoreCase("what")).count());
	}

}
