package CollectionsFramework;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> map = new TreeMap<>();
		map.put("TV", 100);
		map.put("Remote", 100);
		map.put("Sofa", 50);
		map.put("Fridge", 85);
		map.put("Chair", 93);
		
		SortedMap<String, Integer> sortedMap = new TreeMap<>(map);
		System.out.println(sortedMap); 
		
		List<Map.Entry<String, Integer>> number = new ArrayList<>(map.entrySet());
		number.sort((e1, e2 ) -> e1.getValue().compareTo(e2.getValue()));
		
		Map<String, Integer> valueSortedMap = new LinkedHashMap<>();
		for (Entry<String, Integer> entry : number) {
			valueSortedMap.put(entry.getKey(), entry.getValue());
//			System.out.println(entry.getValue());
		}
		
		System.out.println(valueSortedMap);
		
		System.out.println(map);	// sorting 
	}

}
