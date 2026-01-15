package Java8Features;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class LengthOfEachWordInList {

	public static void main(String[] args) {

		//Immutable list by using List.of -> List.of can't store null values
		List<String> list = List.of("I", "am", "Learning", "Java", "Streams");	
//		To add null in immutable list we can use Collections.unmodifiableList()
		
		List<String> immutableList = Collections.unmodifiableList(Arrays.asList(null, "am", "Learning", "Java", "Streams"));
		
//		list.add("Akshada");		UnsupportedOperationException
		
//		System.out.println(list);
//		System.out.println(immutableList);
		
		
		// print length only 
		System.out.println(immutableList.stream()
				.filter(Objects::nonNull)
				.map(String :: length)
				.sorted()
				.collect(Collectors.toList()));
		
		// print length with respective words -> Approach 1
		System.out.println(immutableList.stream()
				.filter(Objects::nonNull)
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()))
				.entrySet().stream()
				.map(x -> x.getKey() + ": " + x.getKey().length())
				.sorted()
//				.sorted(Comparator.comparing(x -> x.getValue()))
				.collect(Collectors.toList()));
		
		// print length with respective words -> Approach 2
		immutableList.stream().filter(Objects :: nonNull)
		.distinct()
		.map(word -> word + ": " + word.length())
		.forEach(System.out :: println);;
		
	}

}
