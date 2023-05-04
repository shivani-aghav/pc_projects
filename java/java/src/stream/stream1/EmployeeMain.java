package stream.stream1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Shivani", Arrays.asList("Kolhapur", "Satara", "Sangli"));
		Employee e2 = new Employee(2, "Achyut", Arrays.asList("Satara", "Pune", "Mumbai"));
		Employee e3 = new Employee(3, "Sam", Arrays.asList("Banglore", "Kolhapur", "Indore"));

		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);

//	ArrayList<Object> id = new ArrayList<>();
//	for (Employee emp : list) {
//		id.add(emp.getId());
//	}
//	System.out.println(id);

		// getting id in list format
		list.stream().map(emp -> emp.getId()).collect(Collectors.toList()).forEach(System.out::println);
		
		// not wanted repeated cities just want common cities
		Set<List<String>> collect = list.stream().map(emp -> emp.getCitiesWorkedIn()).collect(Collectors.toSet());
		System.out.println(collect);

		
		
		
		
	}
}
