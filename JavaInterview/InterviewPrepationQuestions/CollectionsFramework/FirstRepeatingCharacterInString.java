package CollectionsFramework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstRepeatingCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcdkedlep";
		
//		Approach 1
		
		repeatingCharFromStringByHashMap(s);
		
//		Approach 2
		
		repeatingCharFromStringByHashSet(s);
        
        
	}
	
	public static void repeatingCharFromStringByHashMap(String s) {
		char[] chars = s.toCharArray();

		Map<Character, Integer> map = new HashMap<>();
		for(char c : chars) {
			map.put(c, map.getOrDefault(c, 0) + 1);
			
			if(map.get(c) > 1) {
				System.out.println("First repeating char: "+ c);
				return;
			}
			
		}
	}
	
	public static void repeatingCharFromStringByHashSet(String s) {
		
		Set<Character> set = new HashSet<>();
		for(char c : s.toCharArray()) {
			if(set.contains(c)) {
				System.out.println("First repeating char: "+ c);
				return;
			}
			set.add(c);
		}
	}

}
