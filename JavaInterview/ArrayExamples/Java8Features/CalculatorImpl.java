package Java8Features;

public class CalculatorImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c = (a,b) -> a+b;
		System.out.println(c.add(5, 10));

	}


}
