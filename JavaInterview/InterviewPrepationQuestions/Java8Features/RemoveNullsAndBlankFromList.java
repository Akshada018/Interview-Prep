package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveNullsAndBlankFromList {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("A", null, " ", "B", " C ", "");
		
		System.out.println(
				list.stream().filter(Objects::nonNull)
				.filter(s -> !s.trim().isEmpty())
				.map(s -> s.trim())		// to remove leading and trailing space
				.collect(Collectors.toList()));
	}

}
