package Strings;

public class ReverseString {
	
	public static void main(String [] args) {
		// Using for loop and character array
		String s = "hello";
		char[] s2= s.toCharArray();
		String reversed = "";
		
		for(int i = s.length() -1 ; i >= 0; i--) {
			reversed += s2[i]; 
		}
		
		System.out.println("Original: "+s);
		System.out.print("Reversed: "+reversed);
	}

}
