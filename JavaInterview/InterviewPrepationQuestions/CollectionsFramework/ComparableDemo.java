package CollectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> ls = new ArrayList<>();
		ls.add(new Employee(101, "Akshada", 35000d));
		ls.add(new Employee(102, "Ravi", 50000d));
		ls.add(new Employee(103, "Jayesh", 40000d));
		ls.add(new Employee(104, "Akash", 50000d));

		ls.sort(null);		// this will through exception --> class CollectionsFramework.Employee cannot be cast to class java.lang.Comparable
		System.out.println(ls);
		
//		List<Integer> numbers = new ArrayList<>();
//		numbers.add(76);
//		numbers.add(1);
//		numbers.add(4);
//		numbers.add(89);
//		numbers.sort(null);	// this will not through exception because Integer is not an custom class and it implements Comparable 
//		that's why it will give natural sorting. So if in custom class we want sorting then we have to implement Comparable interface and override compareTo method for custom logic of sorting.
//		System.out.println(numbers);
		
	}

}
