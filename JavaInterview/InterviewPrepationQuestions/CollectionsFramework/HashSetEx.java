package CollectionsFramework;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {

		HashSet<Employee> hs = new HashSet<>();
		// if we do not override the equals and hashcode methods in Employee class then HashSet will store below objects in 4 diff buckets so 
//		duplicate values will be stored in set, which against the rule of set that's why we need to override the equals and hashcode both methods from 
//		Object class into Employee class
		hs.add(new Employee(101, "Akshada", 20000d));
		hs.add(new Employee(101, "Akshada", 20000d));
		hs.add(new Employee(101, "Akshada", 20000d));
		hs.add(new Employee(101, "Akshada", 20000d));
		
		
		System.out.println(hs);	// this will print 4 of the objects before overriding equals and hashcode method & after overriding both equals and hashcode method it will only print one record
	
		
	}

}
