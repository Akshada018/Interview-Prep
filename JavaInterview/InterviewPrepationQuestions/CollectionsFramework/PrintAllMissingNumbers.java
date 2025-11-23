package CollectionsFramework;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintAllMissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 4, 5, 7, 10};
		int start = 1;
		int end = 10;
//		missingNumbersByHashSet(arr, start, end);
		missingNumbersByStream(arr, start, end);
		
	}

	public static void missingNumbersByHashSet(int[] arr, int start, int end) {
		
		Set<Integer> number = new HashSet<>();
		for (int n : arr) {
			number.add(n);
		}

		for (int i = start; i <= end; i++) {
			if (!number.contains(i)) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void missingNumbersByStream(int[] arr, int start, int end) {
		Set<Integer> number = new HashSet<>();
		for(int n : arr) {
			number.add(n);
		}
		
		System.out.println(IntStream.rangeClosed(start, end).filter(i -> !number.contains(i))
		.mapToObj(String :: valueOf).collect(Collectors.joining(",")));
		
	}
}
