package Java8Features;

import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<String> startsWith = s -> s.toLowerCase().startsWith("a");
		Predicate<String> endsWith = s -> s.toLowerCase().endsWith("a");
		
		Predicate<String> nameCheckWithAnd = startsWith.and(endsWith);
		Predicate<String> nameCheckWithOr = startsWith.or(endsWith);
		System.out.println(nameCheckWithAnd.test("Akshada"));
		System.out.println(nameCheckWithOr.test("Shravya"));
		System.out.println(nameCheckWithAnd.test("Komal"));
		
		
	}

}
