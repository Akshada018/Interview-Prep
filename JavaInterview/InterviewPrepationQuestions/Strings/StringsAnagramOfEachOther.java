package Strings;

import java.util.HashMap;
import java.util.Map;

public class StringsAnagramOfEachOther {

	public static void main(String[] args) {
//		String s1 = "Akshadaa"; // --> A = 3, k=1, s=1, h=1, d=1
//		String s2 = "akshadaa"; // --> k=1, s=1, h=1, a=3, d=1
		String s1 = "Dormitory "; // --> A = 3, k=1, s=1, h=1, d=1
		String s2 = "Dirtyroom"; // --> k=1, s=1, h=1, a=3, d=1
		if(areAnagrams (s1, s2)) 
			System.out.println(s1 + " & "+ s2 +" are anagrams of each other");
		else
			System.out.println(s1 + " & "+ s2 +" are not anagrams of each other");

	}
	
	public static boolean areAnagrams(String s1, String s2) {
        // code here
		
		String s1new = s1.replaceAll(" ", "");
		String s2new = s2.replaceAll(" ", "");
		
		if(s1new.length() != s2new.length()){
            return false;
        }
		
		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();
		
		for(char ch :s1new.toLowerCase().toCharArray()) {
			map1.put(ch, map1.getOrDefault(ch, 0) + 1);
		}
		
		for(char ch :s2new.toLowerCase().toCharArray()) {
			map2.put(ch, map2.getOrDefault(ch, 0) + 1);
		}

		return map1.equals(map2);
        
    }

}
