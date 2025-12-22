package Java8Features;

public class ConcatStringUsingLambdaAndAnonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Using Anonymous class
		FunctionalInterfaceEx fi = new FunctionalInterfaceEx() {

			@Override
			public void apply(String s1, String s2, String s3) {
				System.out.println(s1+s2+s3);
			}
			
		};
		
		fi.apply("Akshada ", "Shankar ","Shinde");
		
		
//		Using Lambda Expression
		
		FunctionalInterfaceEx fi1 = (s1,s2,s3) -> System.out.println(s1+s2+s3);;
		
		fi1.apply("Ravikiran ", "Aniruddh ", "Chavan");
		
	}

}
