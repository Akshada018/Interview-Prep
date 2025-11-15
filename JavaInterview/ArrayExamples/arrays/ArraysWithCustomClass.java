package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import CollectionsFramework.Employee;

public class ArraysWithCustomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee[] emp = new Employee[5];
		
		emp[0] = new Employee(1, "Akshada", 50000d);
		emp[1] = new Employee(2, "Riya", 40000d);
		emp[2] = new Employee(3, "Akshay", 35000d);
		emp[3] = new Employee(4, "Roshan", 37000d);
		emp[4] = new Employee(5, "Sonali", 29000d);
		
		
		List<Employee> list = Arrays.asList(emp);
		// Only highest salary value
		Double highestSalary = list.stream().map(e -> e.salary)
				.max(Double:: compare)
				.orElse(null);	
		
		System.out.println("Highest salary value: "+highestSalary);
		
		// To print highest salary employee details
		Employee highestSalaryEmp = list.stream().max(Comparator.comparing(e -> e.salary))
				.orElse(null);
		
		System.out.println("Employee with highest salary: "+highestSalaryEmp);

//		for(Employee e: emp) {
//		System.out.println(e.id + "-"+ e.name + "-" + e.salary);
//		
//		
//		}
		
		Employee secondHighest = list.stream().sorted(Comparator.comparing(e -> e.salary, Comparator.reverseOrder()))
				.skip(1).findFirst().orElse(null);
		
		System.out.println("Employee with second highest salary: "+secondHighest);

		
	}

}
