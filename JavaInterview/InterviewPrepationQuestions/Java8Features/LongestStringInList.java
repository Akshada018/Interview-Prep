package Java8Features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestStringInList {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("java", "springboot", "ai");
		
		Optional<String> longestString = list.stream().max(Comparator.comparing(String :: length));
		
		System.out.println(longestString.get());
		
	}

}
