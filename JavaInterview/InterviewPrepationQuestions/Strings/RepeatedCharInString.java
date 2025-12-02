package Strings;

import java.util.HashSet;
import java.util.Set;

public class RepeatedCharInString {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcbabds";
		
		repeatedChar(s);
		
	}
	
	public static void repeatedChar(String s) {
		
		Set<Character> set = new HashSet<>();
		
		for(char ch : s.toCharArray()) {
			if(set.contains(ch)) {
				System.out.println("First repeated char in string: "+ ch);
				return;
			}
			
			set.add(ch);
		}
	}

}
