package Java8Features;

import java.util.Arrays;

public class ThirdLargestElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int arr[] ={1,2,3,4,5,6,7,8,9,10};
		 
		 System.out.println(Arrays.stream(arr)
				 .distinct()
				 .boxed()
				 .sorted((a,b) -> b - a)
				 .skip(2)
				 .mapToInt(Integer :: intValue)
				 .findFirst().getAsInt());

	}

}
