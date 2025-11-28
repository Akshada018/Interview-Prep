package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class UpperCaseStringUsingFlatMap {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> sentences = Arrays.asList("Hello world", "Java streams are powerful", "flatmap is useful");
		
		System.out.println(sentences.stream().flatMap(sentence -> Arrays.stream(sentence.split(" ")))
				.map(String::toUpperCase).collect(Collectors.toList()));
		
	}

}
