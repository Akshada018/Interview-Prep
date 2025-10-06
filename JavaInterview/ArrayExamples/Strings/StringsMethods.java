package Strings;

public class StringsMethods {

	public static void main(String [] args) {
		// indexOf() / lastIndexOf()
		
		String s = "banana";
		
		System.out.println(s.indexOf('a'));
		System.out.println(s.lastIndexOf('a'));
		System.out.println(s.indexOf("na"));
		System.out.println(s.lastIndexOf("an"));
	}
}
