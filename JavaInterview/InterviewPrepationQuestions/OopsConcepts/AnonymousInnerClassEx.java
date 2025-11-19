package OopsConcepts;

public class AnonymousInnerClassEx {
	
	static {
		System.out.println("Static block executes...");	// --> static block executes before main method as well. because static blocks are belongs to class 
//		and when classloader loads the the class into JVM for the first time static variables, static blocks are executed in order they appear.
//		before java 6 we needed to load JDBC driver explicitly / manually using static block. They are stored inside Method Area(Metaspace from java 8)
	}
	
	public static void main(String[] args) {
		Animal dog = new Animal() {			// -> this is anonymous inner class which use for interface implementation. It declared and initialized at a same time.
			public void sound() {
				System.out.println("Dog is barking...");
			}
		};
		
		dog.sound();
	}

}
