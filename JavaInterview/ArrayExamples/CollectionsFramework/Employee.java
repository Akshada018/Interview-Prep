package CollectionsFramework;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
	
	public int id;

	public String name;
	
	public Double salary;
	
	public Employee(int id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return this.id + "-" + this.name + "-" + this.salary;
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
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(salary, other.salary);
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		int result = Double.compare(o.salary, this.salary);	// this will return higher salary first --> return in descending order
		if(result == 0) {
			result = this.id - o.id;	// return in ascending order 
		} if(result == 0) {
			result = this.name.compareTo(o.name);	// return in ascending order 
		}
		
		return result;		
	}

	

}
