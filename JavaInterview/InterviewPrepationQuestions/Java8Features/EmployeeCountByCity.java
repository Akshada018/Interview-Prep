package Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.stream.Collectors;

class Employee{
	private int id;
	private String  name;
	private String city;
	
	
	public Employee(int i, String name, String city) {
		super();
		this.id = i;
		this.name = name;
		this.city = city;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public int hashCode() {
		return Objects.hash(city, id, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(city, other.city) && id == other.id && Objects.equals(name, other.name);
	}
	
	
	
	
}
public class EmployeeCountByCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(1, "Akshada", "Pune"));
		list.add(new Employee(2, "Dipali", "Nagar"));
		list.add(new Employee(3, "Smita", "Mumbai"));
		list.add(new Employee(4, "Shraddha", "Kolhapur"));
		list.add(new Employee(6, "Sanika", "Kolhapur"));
		list.add(new Employee(5, "Jayesh", "Pune"));
		
		Map<String, Long> map = new TreeMap<>(
				list.stream().collect(Collectors.groupingBy(Employee::getCity, Collectors.counting())));
		
		System.out.println(map);

	}

}
