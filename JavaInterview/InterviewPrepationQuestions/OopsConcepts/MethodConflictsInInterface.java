package OopsConcepts;

public class MethodConflictsInInterface implements Printer, Scanner{

	@Override
	public void print() {
		Printer.super.print();
		Scanner.super.print();
	}

	public void print(int a) {
		
	}
	
	static void scan() {
		
	}
}
