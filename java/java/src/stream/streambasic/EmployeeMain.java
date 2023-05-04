package stream.streambasic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//4th max salary //sorting employee SALARY
public class EmployeeMain {

	public static void main(String[] args) {
		Employee[] emp = {
		        new Employee(1, "Jeff Bezos", 40000), 
		        new Employee(2, "Bill Gates", 20000), 
		        new Employee(3, "Mark Zuckerberg", 32000),
		        new Employee(4, "Mala Pandit", 18000), 
		        new Employee(5, "Rekha Daya", 27000), 
		        new Employee(6, "Supiya Datta", 35000)
		    };
		List<Employee> asList = Arrays.asList(emp);
//		Stream.of(emp).sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
//		System.out.println();
//		Stream.of(emp).sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(3).findFirst().ifPresent(System.out::println);
		
//		Stream.of(emp).sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
		
//		Stream.of(emp).sorted((o1, o2) ->(int)( o1.getSalary()-o2.getSalary())).collect(Collectors.toList()).forEach(System.out::println);
		
		Collections.sort(asList,new GetSalary());
		for (Employee employee : asList) {
			System.out.println(employee);
		}
	}

}
