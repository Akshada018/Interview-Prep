package Java8Features;

import java.util.*;
import java.util.stream.*;

//Find Duplicate Elements in List

public class DuplicateElementsFromList {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(12,78,12,89,39,20,78));
		
		System.out.println(list.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting())).entrySet()
				.stream().filter(x -> x.getValue() > 1).collect(Collectors.toList()));
	}

}
