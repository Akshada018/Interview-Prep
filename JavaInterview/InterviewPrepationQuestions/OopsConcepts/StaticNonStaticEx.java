package OopsConcepts;

public class StaticNonStaticEx {

	static int staticVar = 10;
	int instanceVar = 20;
	
	static void staticMethod() {
		System.out.println("printing static variable: "+ staticVar);
		StaticNonStaticEx s = new StaticNonStaticEx();
		System.out.println("printing non static variable: "+ s.instanceVar);
	}
	
	
	public static void main(String[] args) {
		staticMethod();
		Printer.scan();
	}
}
