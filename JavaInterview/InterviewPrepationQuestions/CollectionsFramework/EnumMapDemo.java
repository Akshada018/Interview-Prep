package CollectionsFramework;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class EnumMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Day, String> map = new HashMap<>();
		map.put(Day.TUESDAY, "Gym");
		map.put(Day.MONDAY, "Walk");
		map.put(Day.THURSDAY, "Swim");
		System.out.println(map);		//{TUESDAY=Gym, THURSDAY=Swim, MONDAY=Walk} --> cause here we are using nornal hashMap so it will 
//		just add entries as per insertion order.
		
		
		Map<Day, String> enumMap = new EnumMap<>(Day.class);
		enumMap.put(Day.TUESDAY, "Gym");
		enumMap.put(Day.MONDAY, "Walk");
		enumMap.put(Day.THURSDAY, "Swim");
		
		System.out.println(enumMap);   //{MONDAY=Walk, TUESDAY=Gym, THURSDAY=Swim}  --> will use indexing means the entries will be inserted as per the
//		indexing from Day enum.  

	}
	
	
	enum Day{
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}

}
