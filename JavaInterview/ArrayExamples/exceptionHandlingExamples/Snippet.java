package exceptionHandlingExamples;

public class Snippet implements TryWithResourcesExInterface {
	
	
	public void trying() {
		System.out.println("Trying...");
	}
	
	public void close() {
		System.out.println("Disconnecting...");
		
	}
}

