package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMap {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("A", "B", "C", "A");
		
		Map<String, Integer> map = list.stream().collect(Collectors.toMap(k -> k, v -> 1, Integer :: sum));
		
		System.out.println(map);
		
	}

}
