package Java8Features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestPaidEmpByDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<EmployeeDtl> list = new ArrayList<>();
		
		list.add(new EmployeeDtl(1, "Akshada", 34000d, "Software Development"));
		list.add(new EmployeeDtl(2, "Dasharath", 40000d, "Software Development"));
		list.add(new EmployeeDtl(3, "Smita", 30000d, "Human Resource"));
		list.add(new EmployeeDtl(4, "Sushant", 32000d, "Human Resource"));
		list.add(new EmployeeDtl(5, "Anand", 25000d, "Software Tester"));
		list.add(new EmployeeDtl(6, "Sonali", 50000d, "Software Tester"));
		
		Map<String, Optional<EmployeeDtl>> map = list.stream().collect(Collectors.groupingBy(EmployeeDtl::getDepartment,
				Collectors.maxBy(Comparator.comparing(EmployeeDtl::getSalary))));
		
		for(Map.Entry<String, Optional<EmployeeDtl>> m : map.entrySet()) {
			
			System.out.println(m.getKey() + "-" + m.getValue().get());
		}
		

	}

}
