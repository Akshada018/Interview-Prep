package Java8Features;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {

		List<String> sentences = List.of(
		        "java spring",
		        "spring boot"
		);
		
		sentences.stream().flatMap(s -> Arrays.stream(s.split(" "))).distinct().forEach(System.out::println);
	}

}
