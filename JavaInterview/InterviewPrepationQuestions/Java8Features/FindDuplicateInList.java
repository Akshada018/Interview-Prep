package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateInList {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 3, 5);
		
		Set<Integer> duplicate = list.stream()
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e -> e.getValue() > 1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toSet());

		System.out.println(duplicate);

	}

}
