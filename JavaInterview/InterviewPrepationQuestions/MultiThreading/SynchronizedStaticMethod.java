package MultiThreading;

class Printer {
	synchronized static void printDoc(String doc, int copies) {
		for (int i = 0; i <= copies; i++) {
			System.out.println(Thread.currentThread().getName() + " printing " + doc + "copy: " + i);
		}
	}
}

public class SynchronizedStaticMethod {

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> Printer.printDoc("exam result ", 5));
		t1.start();
	}
}
