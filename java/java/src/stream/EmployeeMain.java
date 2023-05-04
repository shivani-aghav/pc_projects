package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee e1 = new Employee("shivani", "JE", 12000, 1);
		Employee e2 = new Employee("caroline", "SE", 10000, 3);
		Employee e3 = new Employee("neena", "AE", 8000, 2);

		ArrayList<Employee> list2 = new ArrayList<>();
		list2.add(e1);
		list2.add(e2);
		list2.add(e3);

		Map<Integer, Employee> map = list2.stream().sorted(Comparator.comparingInt(Employee::getSalary)).collect(
				Collectors.toMap(Employee::getId,Function.identity(), (x, y) ->y, LinkedHashMap::new));
		map.forEach((x,y)->System.out.println(x + " " + y));
	}
}
