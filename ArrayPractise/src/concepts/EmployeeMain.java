package concepts;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		list.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		list.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		list.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		list.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		list.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		list.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		list.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		list.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		list.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		list.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		list.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		list.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		list.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		list.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		list.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		list.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		// How many male and female employees are there in the organization?
		list.stream()
				.collect(Collectors.groupingBy(Employee::getGender,
						Collectors.mapping(Employee::getName, Collectors.toList())))
				.entrySet().forEach(System.out::println);
		;
		// counting
		list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())).entrySet()
				.forEach(System.out::println);
		System.out.println("------------------------");

		// Print the name of all departments in the organization

		list.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		System.out.println("------------------------");

		// What is the average age of male and female employees?
		list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)))
				.entrySet().forEach(System.out::println);
		System.out.println("------------------------");

		// Get the details of highest paid employee in the organization
		list.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
		System.out.println("------------------------");

		// Get the names of all employees who have joined after 2015?
		list.stream().filter(t -> t.getYearOfJoining() > 2015).map(Employee::getName).forEach(System.out::println);
		System.out.println("------------------------");

		// Count the number of employees in each department?
		list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())).entrySet()
				.forEach(System.out::println);
		System.out.println("------------------------");

		// What is the average salary of each department?
		list.stream()
				.collect(
						Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)))
				.entrySet().forEach(System.out::println);
		System.out.println("------------------------");

		// Get the details of youngest male employee in the product development
		// department?
		list.stream().filter(t -> t.getDepartment().equalsIgnoreCase("product development"))
				.sorted(Comparator.comparing(Employee::getAge)).findFirst().ifPresent(System.out::println);
		System.out.println("------------------------");

		// Who has the most working experience in the organization?
		list.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).findFirst()
				.ifPresent(System.out::println);
		System.out.println("------------------------");

		// How many male and female employees are there in the sales and marketing team?
		list.stream().filter(t -> t.getDepartment().equalsIgnoreCase("sales and marketing"))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())).entrySet()
				.forEach(System.out::println);
		System.out.println("------------------------");

		// What is the average salary of male and female employees?
		list.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)))
				.entrySet().forEach(System.out::println);
		System.out.println("------------------------");

		// List down the names of all employees in each department?
		list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.mapping(Employee::getName, Collectors.toList())))
				.entrySet().forEach(System.out::println);
		;
		System.out.println("------------------------");

		// What is the average salary and total salary of the whole organization?

		DoubleSummaryStatistics collect = list.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("Average Salary : " + collect.getAverage());
		System.out.println("Total Salary : " + collect.getSum());
		System.out.println("------------------------");
		
		//Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
		 Map<Boolean, List<Employee>> map = list.stream().collect(Collectors.partitioningBy(e->e.getAge()>25));
		
		Set<Entry<Boolean, List<Employee>>> set = map.entrySet();
        for (Entry<Boolean, List<Employee>> e : set) {
        	if (e.getKey()) {
        		System.out.println("Employees older than 25 years :");
        		System.out.println("---------");
			}else {
				System.out.println("Employees younger than or equal to 25 years :");
				System.out.println("---------");
			}
        	List<Employee> value = e.getValue();
        	for (Employee e1 : value) {
				System.out.println(e1.getName());
			}
		}
        System.out.println("------------------------");
        
        // Who is the oldest employee in the organization? What is his age and which department he belongs to?
        Optional<Employee> max = list.stream().max(Comparator.comparingInt(Employee::getAge)); 
        System.out.println("oldest employee in the organization : "+max.get().getName());
        System.out.println("his age : "+max.get().getAge());
        System.out.println("his department : "+max.get().getDepartment());
        
        System.out.println("------------------------");
       double d=1.1;
       System.out.println(++d);
	}
}
