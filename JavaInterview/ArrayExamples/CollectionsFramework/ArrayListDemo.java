package CollectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>(Arrays.asList("Cat", "Dog", "Elephant", "Tiger", "Snake"));
		
		for(String s : list) {
			System.out.println(s + " ");
		}
		
		Iterator<String> animals = list.iterator();
		
		while(animals.hasNext()) {
			System.out.print(animals.next() + " ");
		}

	}

}
