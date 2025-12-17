package Java8Features;

import java.util.Arrays;

public class WordsWithSpecifiedNoOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Here we want to print those words in which exactly 2 vowels are present. O/P = Streams, API, Java
		String str = "I am learning Streams API in Java";

		Arrays.stream(str.split(" ")).filter(x -> x.replaceAll("[^aeiouAEIOU]", "").length() == 2)
				.forEach(System.out :: println);

	}

}
