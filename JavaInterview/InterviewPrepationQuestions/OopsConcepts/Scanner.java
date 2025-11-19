package OopsConcepts;

public interface Scanner {
	
	default void print() {
		System.out.println("Printing inside scanner...");
	}

}
