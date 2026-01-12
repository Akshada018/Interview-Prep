package CollectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumFromListWithoutDuplicateElements {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>(Arrays.asList(1,5,4,2,9,9,9));
		
//		Set<Integer> set = new LinkedHashSet<>(list);
		
		int k = 3;
		
		int target = 15;
		
		List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());
		
//		IntStream.range(0, distinctList.size() - k + 1)
		
//		System.out.println(set);
		
		

	}
}
