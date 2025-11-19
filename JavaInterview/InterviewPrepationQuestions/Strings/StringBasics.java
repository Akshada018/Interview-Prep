package Strings;

public class StringBasics {
	
	public static void main(String [] args) {
		
		String s1 = "abc";
		s1 = s1.concat("xyz");
		
		System.out.println(s1);
		
		System.out.println("Hashcode 1 "+s1.hashCode());
		System.out.println("Hashcode 2 "+s1.concat("xyz").hashCode());
		
		
//		"abc" and "xyz" stored in SCP (string literals).
//
//		"abcxyz" created in Heap at runtime.
//
//		s1 points to Heap object after concatenation.
		
	}

}
