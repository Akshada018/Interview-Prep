package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintListOfEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,6,7,8};
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

		Map<Boolean, List<Integer>> map = list.stream()
				.collect(Collectors.groupingBy(x -> x % 2 == 0, Collectors.toList()));
		
		for(Map.Entry<Boolean, List<Integer>> m : map.entrySet()) {
			System.out.println(m.getValue());
			
		}
	}

}
