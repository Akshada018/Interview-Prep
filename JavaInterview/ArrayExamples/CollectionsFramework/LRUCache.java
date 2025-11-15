package CollectionsFramework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LRUCache<K, V> extends LinkedHashMap<K, V>{

	/**
	 * 
	 */
	// LRU --> Least Recently Used --> It is a cache eviction algorithm that removes the item that was least recently accessed when the cache is full.
	private static final long serialVersionUID = 5040639960026637991L;

	private int capacity;
	
	// parameterized constructor with capacity field
	public LRUCache(int capacity){
		super(capacity, 0.75f, true);
		this.capacity = capacity;
		
	}
	
	// method to remove least recently used entry from map
	@Override
	protected boolean removeEldestEntry(Entry<K, V> eldest) {
		// TODO Auto-generated method stub
		return size() > capacity;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LRUCache<String, Integer> studentMap = new LRUCache<>(3);
		
		studentMap.put("Akshada", 90);
		studentMap.put("Ankita", 85);
		studentMap.put("Ravi", 88);
		studentMap.put("Jayesh", 80);
		
		System.out.println(studentMap);		// will remove studentMap.put("Akshada", 90); as linkedhashmap inserts the record in ordered manner, 
//		 but if the ordering mode - {@code true} for access-order, {@code false} for insertion-order
		
		studentMap.put("Akshada", 90);
		studentMap.put("Ankita", 85);
		studentMap.put("Ravi", 88);
		studentMap.get("Akshada");
		studentMap.put("Jayesh", 80);
		
		System.out.println(studentMap);	// {Ravi=88, Akshada=90, Jayesh=80} will be print and studentMap.put("Ankita", 85); will be removed as akshada is getting used 
//		and Ankita is now least useful
		
		studentMap.put("Akshada", 90);
		studentMap.put("Ankita", 85);
		studentMap.put("Ravi", 88);
		studentMap.put("Jayesh", 80);
		studentMap.get("Akshada");
		
		System.out.println(studentMap);	// {Ankita=85, Ravi=88, Jayesh=80} will be the output and Akshada will be removed as we inserting 
//		values first then using get for Akshada so at time of insertion only Akshada is least used and others are considered as used
		for(Map.Entry<String, Integer> entry: studentMap.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue()); 
		}
		
	}

}
