package Java8Features;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ListContainsOddOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>(Arrays.asList(10,22,14,76,24,91));
		
		System.out.println(oddOrNotByParallelStream(list));
		System.out.println(oddOrNotByStream(list));
		System.out.println(oddOrNotByFor(list));
		
	}
	
	public static boolean oddOrNotByParallelStream(List<Integer> list) {
		return list.parallelStream().anyMatch(x -> x%2 != 0);
	}
	
	public static boolean oddOrNotByStream(List<Integer> list) {
		return list.stream().anyMatch(x -> x%2 != 0);
	}
	
	public static boolean oddOrNotByFor(List<Integer> list) {

		boolean oddOrNot = false;

		if (!list.isEmpty()) {
			for (Integer integers : list) {
				if (integers % 2 != 0) {
					oddOrNot = true;
				}

			}
		}

		return oddOrNot;

	}
	
	

}
