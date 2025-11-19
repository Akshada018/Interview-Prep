package CollectionsFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Orange");
		map1.put(2, "Banana");
		map1.put(0, "Apple");
		map1.put(3, "Pineapple");
		
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("Orange", 1);
		map2.put("Banana", 2);
		map2.put("Apple", 3);
		map2.put("Pineapple", 4);
		
		
		Map<Person, String> emp = new HashMap<>();
		emp.put(new Person(110, "Akshada", 25), "Software Developer");
		emp.put(new Person(110, "Akshada", 25), "Software Developer");
		emp.put(new Person(110, "Akshada", 25), "Software Developer");
		emp.put(new Person(110, "Akshada", 25), "Software Developer");
		
		System.out.println(emp);
		
//		System.out.println(map1);
//		System.out.println(map2);	//{Apple=3, Pineapple=4, Orange=1, Banana=2}
//		1 -> {0=Apple, 1=Orange, 2=Banana, 3=Pineapple}

		
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(1, "Orange");
		map.put(2, "Banana");
		map.put(0, "Apple");
		map.put(3, "Pineapple");
		
//		System.out.println(map);		// will insert in insertion order
	}

}
