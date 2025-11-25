package Strings;

public class ReverseStringUsingRecursion {

	public static String reverseString(String str) {
		if(str.isEmpty()) {
			return str;
		}
		
		return reverseString(str.substring(1)) + str.charAt(0);
	}
	
	public static void main(String [] args) {
		String str = "akshada";
		String reversed = reverseString(str);
		
		System.out.println("Original: "+ str);
		System.out.println("Reverse: "+ reversed);
	}
}
