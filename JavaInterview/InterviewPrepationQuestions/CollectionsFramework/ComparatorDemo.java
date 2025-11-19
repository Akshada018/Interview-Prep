package CollectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> personList = new ArrayList<>();
		personList.add(new Person(110,"Ankita", 27));
		personList.add(new Person(111,"Asmita", 17));
		personList.add(new Person(112,"Anushka", 15));
		
		personList.sort((p1, p2) -> Integer.compare(p1.age, p2.age));
		
		System.out.println("Sorted by Age: "+personList);
		
		personList.sort((p1, p2) -> p1.name.compareTo(p2.name));
		
		System.out.println("Sorted by Name: "+personList);
		
		personList.sort((p1, p2) -> Integer.compare(p1.id, p2.id));
		
		System.out.println("Sorted by Id: "+personList);
	}

}
