package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountFrequencyOfEachLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("A", "B", "A", "C", "B");
		
		Map<String,Long> frequency = names.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));

		System.out.println(frequency);
	}

}
