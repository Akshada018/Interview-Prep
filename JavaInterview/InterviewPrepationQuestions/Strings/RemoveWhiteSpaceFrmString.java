package Strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveWhiteSpaceFrmString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Aks had a";
		System.out.println(s.replaceAll(" ", ""));
//		removerSpaceFromStringUsingFor(s);
//		removeSpaceFromStringUsingStream(s);
		removeSpaceFromStringUsingStream1(s);
		
	}
	
	private static void removeSpaceFromStringUsingStream1(String s) {
		
		String[] str = s.split(" "); 
		System.out.print(Arrays.stream(str).filter(c -> c != " ").collect(Collectors.joining()));
		
	}

	public static void removeSpaceFromStringUsingStream(String s) {
		
		
		String result = s.chars().filter(c -> c != ' ').mapToObj(c -> String.valueOf((char) c))
				.collect(Collectors.joining());
		
		System.out.println(result);
	}
	
	public static void removerSpaceFromStringUsingFor(String s) {
		char[] arr = s.toCharArray();

		StringBuilder sb = new StringBuilder();

		for (char ch : arr) {
			if (!Character.isWhitespace(ch)) {
				sb.append(ch);
			}
		}

		System.out.println("Original: "+s);
		System.out.println("After space removal: "+sb);
	}

}
