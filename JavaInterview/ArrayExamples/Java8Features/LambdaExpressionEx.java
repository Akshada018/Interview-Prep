package Java8Features;

public class LambdaExpressionEx {

	public static void main(String[] args) {
		Runnable le = () -> System.out.println("Akshada");
		
		le.run();
//		System.out.println(le.getClass());
//		System.out.println(le.hashCode());
	}
}
