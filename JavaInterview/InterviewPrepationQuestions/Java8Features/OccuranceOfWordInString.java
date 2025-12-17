package Java8Features;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class OccuranceOfWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "I am learning Streams API in Java. Java is OOP language. Am";
		
		String[] arr = str.toLowerCase().split("[ .]+");
		
		Map<String, Long> map =Arrays.stream(arr).collect(Collectors.groupingBy(x -> x, Collectors.counting()));

		System.out.println(map);
	}

}
