package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OccuranceOfCharInString {

	public static void main(String [] args) {
		
		String s1 = "Akshada";
				
		HashMap<Character, Integer> map = new HashMap<>();
		
//		Approach 1
		for(char ch : s1.toLowerCase().toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		
//		Approach 2
		char[] s = s1.toLowerCase().toCharArray();
		
		Map<Object, Long> map1 = Arrays.stream(s1.split(""))
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		
//		Approach 3
		Map<Object, Long> map2 = Arrays.stream(s1.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
//		System.out.println(map);
		System.out.println(map1);
		System.out.println(map2);
		
	
		
	}
}
