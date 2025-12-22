package Java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupWordsByLength {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("java", "spring", "boot", "api"));

		System.out.println(list.stream().collect(Collectors.toMap(word -> word, word -> word.length())));

	}

}
