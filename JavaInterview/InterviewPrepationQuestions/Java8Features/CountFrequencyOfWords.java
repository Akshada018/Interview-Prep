package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequencyOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList("Akshada", "Shinde");
		
		Map<String, Long> map = list.stream()
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));

		Map<String, Long> map2 = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(map);
		System.out.println(map2);
	}

}
