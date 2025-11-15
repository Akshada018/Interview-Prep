package CollectionsFramework;

import java.util.Comparator;
import java.util.Objects;

public class Person {
	
	public int id;
	public String name;
	public int age;
	
	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(age, id, name);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name);
	}



	@Override
	public String toString() {
		return this.id + "-"+ this.name + "-" + this.age;
	}


}
