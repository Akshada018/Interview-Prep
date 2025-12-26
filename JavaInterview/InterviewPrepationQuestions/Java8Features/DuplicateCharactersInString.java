package Java8Features;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharactersInString {

	public static void main(String[] args) {

		String s = "Pprogramming";
		
		System.out.println(Arrays.stream(s.split(""))
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream()
		.filter(x -> x.getValue() > 1)
		.map(x -> x.getKey())
		.collect(Collectors.joining(",")));
//		.forEach(System.out::println);
		
//		System.out.print(Arrays.stream(s.toLowerCase().split(""))
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
//				.filter(x -> x.getValue() == 1).map(x -> x.getKey()).findFirst().get());
		
		System.out.println(Arrays.stream(s.split(""))
				.filter(x -> s.indexOf(x) == s.lastIndexOf(x))
				.findFirst().get());
		

		Character result = s.toLowerCase()
		        .chars()
		        .mapToObj(c -> (char) c)
		        .collect(Collectors.groupingBy(
		                Function.identity(),
		                LinkedHashMap::new,
		                Collectors.counting()
		        ))
		        .entrySet()
		        .stream()
		        .filter(e -> e.getValue() == 1)
		        .map(Map.Entry::getKey)
		        .findFirst()
		        .orElse(null);

		System.out.println(result);

	}

}
