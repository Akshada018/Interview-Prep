package exceptionHandlingExamples;

public class TryWithMultiCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int[] arr = new int[5];
			System.out.println(arr[7]);
			
			String s = null;
			System.out.println(s.length());
		}catch(ArrayIndexOutOfBoundsException | NullPointerException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		try {
			Object o = new Object();
		}catch(ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
			
		}
	}

}
