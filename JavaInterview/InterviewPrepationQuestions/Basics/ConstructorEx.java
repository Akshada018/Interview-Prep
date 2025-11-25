package Basics;

public class ConstructorEx {
	
	{
		System.out.println("Asmita"); //1 - Instance(non-static) block 
		// this gets executed twice because it ties with object creation of a class. 
//		here we instantiated object of the class twice so gets executed twice.
	}

	public ConstructorEx(){ // default or no-argument constructor
		this("akshada");
//		ConstructorEx ce1 = new ConstructorEx();   this will create an infinite loop as we create object with 0 arguments so default contructor will get execute in a loop
		System.out.println("Adarsh"); //
//		When we create object with 0 parameters it calls default constructor and it prints "Adarsh"


	}
	public ConstructorEx(String name){
//		name = "Ankita";
//		ConstructorEx ce1 = new ConstructorEx();
		System.out.println(name);	// 2 - Argumental(Parameterized) constructor
		// first it prints "Anushka" because from main method first object creation is calling parameterized constructor because we are passing a string in it.
	}
	
	public static void main(String[] args) {
		ConstructorEx ce = new ConstructorEx("Anushka");
		ConstructorEx ce1 = new ConstructorEx(); //calls default constructor
		
	}
}

//Output
//Asmita
//Anushka
//Asmita
//akshada
//Adarsh