package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String s ="i.like.this.program.very.much";
		String s ="..geeks..for.geeks.";
		
		reverseWordsUsingFor(s);
		reverseWordsUsingCollections(s);
		reverseWordsUsingStream(s);
		
	}
	
	private static void reverseWordsUsingFor(String s) {
		String[] str = s.split("\\.");
		String strNew = ""; 
		
		
		for (int i = str.length - 1; i >= 0; i--) {
			
			if(str[i].isEmpty()) {
				continue;  // skip empty words created by extra dots
			}
			strNew += str[i];
			
			// Add dot *only* if a valid word exists ahead
	        int j = i - 1;
	        while (j >= 0 && str[j].isEmpty()) {
	            j--;  // skip empty ones
	        }

	        if (j >= 0) {   // if there is a next valid word
	            strNew += ".";
	        }
	    }
		
		System.out.println(strNew);
	}
	
	
	private static void reverseWordsUsingCollections(String s) {
		String[] parts = s.split("\\.");
		
		List<String> words = new ArrayList<>();
		
		for(String str:parts) {
			if(!str.isEmpty()) {
				words.add(str);
			}
		}
		
		Collections.reverse(words);
		
		System.out.println(String.join(".",words));
		
		
	}
	
	private static void reverseWordsUsingStream(String s) {
		
		String[] parts = s.split("\\.");
		
		List<String> words = Arrays.stream(parts).filter(p -> p.length() > 0).collect(Collectors.toList());
		
		Collections.reverse(words);
		
		System.out.println(String.join(".", words));
		
	}

}
