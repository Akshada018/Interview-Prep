package OopsConcepts;

public interface Printer {
	
	default void print() {
		System.out.println("Printing inside printer...");
	}

	 static void scan() {
			System.out.println("Scanning inside printer...");

	}
	 
	void print(int a); // here for the method print we didn't write access modifier so we think it can be default modifier but this is not true in interfaces 
					  //  methods are implicitly public abstract(java 7)
	
	private void sum() {
		System.out.println();
	}
}
