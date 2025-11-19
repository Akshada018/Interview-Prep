package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintNamesBasedOnLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("Akshada", "Ravikiran", "Ak", "Asfiyan", "Bob");
		
		List<String> namesLengthGreaterThanThree = list.stream().filter(x -> x.length() > 3).collect(Collectors.toList());

		System.out.println(namesLengthGreaterThanThree);
	}

}
