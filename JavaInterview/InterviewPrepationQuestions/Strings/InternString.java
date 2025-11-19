package Strings;

public class InternString {

	public static void main(String[]args) {
		
		String str = new String("Intern");		// 	This will store outside the String constant pool
		
		String internedString = str.intern(); 	// now by using intern() method will add string object in string constant pool.
		
		System.out.println(internedString);
		
	}
}
