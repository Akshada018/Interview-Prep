package Basics;

public class InheritanceEx {
	
	public void A() {
		System.out.println("A");
	}

}

class B extends InheritanceEx {
	
	B(){
		super();
	}
	public void A() {
		System.out.println("B");
	}
}

class MainEx{
	public static void main(String args[]) {
		
	}
}
