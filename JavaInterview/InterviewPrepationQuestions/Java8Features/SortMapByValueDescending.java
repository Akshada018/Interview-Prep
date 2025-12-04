package Java8Features;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValueDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = Map.of("A", 3, "B", 1, "C", 2);
		
		Map<String, Integer> sorted = map.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).collect(Collectors
						.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldVal, newVal) -> oldVal, LinkedHashMap::new));
		
		System.out.println(sorted);
		
	}

}
