package CollectionsFramework;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FetchLettersWithAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = new ArrayList<>(5);
		
		Long start  = System.currentTimeMillis();
		
		names.add("Rahul");
		names.add("Harshal");
		names.add("Piyush");
		names.add("Shravya");
		names.add("Shreya");
		
		List<Character> chars = names.stream()
				.map(name -> name.charAt(0))	// first character of each string
				.distinct() // return distinct characters
				.sorted() // will return in ascending order
				.collect(Collectors.toList());
//		 for above stram operation will require O(n log n) time complexity and O(n) as space complexity.
		
		System.out.println(chars);
		
		Long totalTimeTaken = System.currentTimeMillis() - start;
		System.out.println("totalTimeTaken : "+totalTimeTaken);
		
		Long startNew  = System.currentTimeMillis();

		Set<Character> name = names.stream()
				.map(n -> n.charAt(0)).collect(Collectors.toCollection(TreeSet :: new));
		
		System.out.println(name); 
		
		Long newTimeTaken = System.currentTimeMillis() - startNew;
		System.out.println("newTimeTaken : "+newTimeTaken);
		
		
		
		
	}

}
