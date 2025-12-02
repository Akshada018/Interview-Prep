package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsWithLengthRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> ls = Arrays.asList("Akshada", "Smita", "Dipali", "Riya");

		System.out.print(String.join(",",
				ls.stream().filter(s -> s.length() >= 4 && s.length() < 6).collect(Collectors.toList())));

//		for(String str : result) {
//			StringBuilder sb = new StringBuilder(str);
//			System.out.print(String.join(",", result));
//		}
	}

}
