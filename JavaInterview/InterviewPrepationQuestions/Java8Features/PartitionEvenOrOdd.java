package Java8Features;

import java.util.Arrays;
import java.util.stream.Collectors;

public abstract class PartitionEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
//		Arrays.stream(arr).forEach(n -> {
//			if(n % 2 == 0)
//				System.out.println(n +" is even number");
//			else
//				System.out.println(n +" is odd number");
//				
//		});
		
		System.out.println(Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(x -> x % 2 == 0)).entrySet()
				.stream().collect(Collectors.toMap(x -> x.getKey() == true ? "Even" : "Odd", x -> x.getValue())));
	}


}
