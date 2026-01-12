package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Users {

	private int id;
	private String name;
	private String city;
	private double salary;
	private int age;

	public Users(int id, String name, String city, double salary, int age) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Users [name=" + name + "]";
	}
	
	

}

class CityStats {

	List<Users> users;
	double totalSalary;
	double avgAge;

	public CityStats(List<Users> users, double totalSalary, double avgAge) {
		this.users = users;
		this.totalSalary = totalSalary;
		this.avgAge = avgAge;
	}

}

public class UserListByCitySalaryAge {

	public static void main(String[] args) {

		List<Users> usersList = Arrays.asList(new Users(1, "Akshay", "Pune", 50000d, 25),
				new Users(2, "Neha", "Mumbai", 65000d, 28), new Users(3, "Rohan", "Pune", 55000d, 30),
				new Users(4, "Sneha", "Bangalore", 70000d, 26), new Users(5, "Amit", "Mumbai", 60000d, 35),
				new Users(6, "Riya", "Pune", 52000d, 27), new Users(7, "Priya", "Bangalore", 75000d, 29),
				new Users(8, "Rahul", "Mumbai", 68000d, 32));

		Map<String, CityStats> cityStatsMap = usersList.stream().collect(
				Collectors.groupingBy(Users::getCity, Collectors.collectingAndThen(Collectors.toList(), list -> {
					double totalSalary = list.stream().mapToDouble(Users::getSalary).sum();
					double avgAge = list.stream().mapToInt(Users::getAge).average().orElse(0);

					return new CityStats(list, totalSalary, avgAge);
				})));

//		System.out.print(cityStatsMap);
		
		cityStatsMap.forEach((city, stats) -> {
		    System.out.println("City: " + city);
		    System.out.println("Users: " + stats.users);
		    System.out.println("Total Salary: " + stats.totalSalary);
		    System.out.println("Average Age: " + stats.avgAge);
		});
		
//		for(Map.Entry<String, CityStats> map : cityStatsMap.entrySet()) {
//			System.out.println("Users: " + map.getValue().users + "Total salary: " + map.getValue().totalSalary
//					+ "Average Age:  " + map.getValue().avgAge);
//		}

	}

}