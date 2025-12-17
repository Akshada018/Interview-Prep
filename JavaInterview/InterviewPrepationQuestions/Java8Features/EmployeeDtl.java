package Java8Features;

import java.util.Objects;

public class EmployeeDtl{
	
	public int id;

	public String name;
	
	public Double salary;
	
	public String department;
	
	public EmployeeDtl(int id, String name, Double salary, String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	public String toString() {
		return this.id + "-" + this.name + "-" + this.salary;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(department, id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDtl other = (EmployeeDtl) obj;
		return Objects.equals(department, other.department) && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(salary, other.salary);
	}

	

}
