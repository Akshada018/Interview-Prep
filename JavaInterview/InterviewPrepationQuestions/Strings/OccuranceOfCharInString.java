package Strings;

import java.util.HashMap;

public class OccuranceOfCharInString {

	public static void main(String [] args) {
		
		String s1 = "Akshada";
		
		String s2 = s1.toLowerCase();
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char ch : s2.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		System.out.println(map);
		
	}
}
