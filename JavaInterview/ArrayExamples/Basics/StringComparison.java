package Basics;

public class StringComparison {

	public static void main(String[] args) {
		
		String a = new String("Hello");
		String b = new String("Hell");
		
		System.out.println(a.equals(b));
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		//false
//		69609650
//		2245469
		
		String c = new String("Hello");
		String d = new String("Hello");
		
		System.out.println(c.equals(d));
		
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());

	
//		true
//		69609650
//		69609650
		
		
	}

}
