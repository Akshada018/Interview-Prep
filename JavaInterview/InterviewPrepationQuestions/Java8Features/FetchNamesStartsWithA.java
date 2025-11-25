package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FetchNamesStartsWithA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. filter() --> accept predicate type means works with condition and return boolean type
		List<String> names = Arrays.asList("Ankita","Akshada", "Akshada", "Vipul", "Ram", "Anushka");
		
		List<String> namesStartsWithA = names.stream()
				.filter(x -> x.startsWith("A"))
				.collect(Collectors.toList());
		System.out.println("Not unique & sorted names list: "+ namesStartsWithA);	// not sorted and duplicate

		
		List<String> distinctNamesWithA = names.stream()
				.distinct()
				.filter(x -> x.startsWith("A"))
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println("Unique & sorted names list: "+ distinctNamesWithA);	// sorted distinct names
		
		List<String> distinctNamesWithAUsingComparator = names.stream()
				.distinct()
				.filter(x -> x.startsWith("A"))
				.sorted((a,b) -> a.length() - b.length())
				.collect(Collectors.toList());
		System.out.println("Distinct names with custom sorting using comparator" + distinctNamesWithAUsingComparator);
		
		
		Optional<String> firstNameStartsWithA = names.stream()
				.distinct()
				.filter(x -> x.startsWith("A"))
				.sorted()
				.findFirst();
		
		System.out.println("First unique name which starts with A : "+ firstNameStartsWithA.get());
	}

}
