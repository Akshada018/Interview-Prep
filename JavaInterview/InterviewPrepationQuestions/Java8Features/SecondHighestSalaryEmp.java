package Java8Features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

class Emp{
	private int id;
	private String name;
	private Double salary;
	
	public Emp(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(salary, other.salary);
	}
	
	
}

public class SecondHighestSalaryEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Emp> list = new ArrayList<>();
		
		list.add(new Emp(101,"Akshada", 34000d));
		list.add(new Emp(102,"Smita", 25000d));
		list.add(new Emp(103,"Riya", 30000d));
		
		System.out.println(list.stream().sorted(Comparator.comparing(Emp::getSalary).reversed()).distinct().skip(1)
				.findFirst().map(Emp::getName).get());

	}

}
