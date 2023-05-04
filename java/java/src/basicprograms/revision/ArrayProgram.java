package basicprograms.revision;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayProgram {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(
				new Employee(1, "Nobita", 12000, "M", Arrays.asList("KGF", "Annabelle"),"HR"),
				new Employee(2, "Shijuka", 8000, "F", Arrays.asList("Pachadlela", "Conjuring"),"HR"),
				new Employee(3, "Gian", 34000, "M", Arrays.asList("Vedha", "Vikram"),"Finance"),
				new Employee(4, "Dekisugi", 45000, "M", Arrays.asList("Pokemon", "Hagemaru"),"IT"),
				new Employee(5, "Gwen", 18000, "F", Arrays.asList(null, "Ben 10"),"IT"),
				new Employee(6, "Doremi", 20000, "F", Arrays.asList("IT", "Nun"),"Finance"));
		
		long l = System.currentTimeMillis();
		list.stream().filter(t -> t.getSalary()>20000).map(Employee::getName).forEach(System.out::println);
		long m = System.currentTimeMillis();
		System.err.println("---------------------");
		System.out.println(m-l);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		 list.stream().sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getName)).forEach(System.out::println);;
//		list.stream().collect(Collectors.groupingBy(Employee::getDepartment,
//				Collectors.mapping(Employee::getName, Collectors.toList()))).entrySet().forEach(System.out::println);
//		list.stream().filter(t -> t.getSalary()>20000).map(Employee::getSalary).reduce((t, u) -> t>u?t:u).ifPresent(System.out::println);
//		list.stream().filter(t -> t.getSalary()>20000).map(Employee::getSalary).reduce(Long::max).ifPresent(System.out::println);
//		list.stream().max(Comparator.comparing(Employee::getSalary)).map(Employee::getSalary).ifPresent(System.out::println);
//		list.stream().min(Comparator.comparing(Employee::getSalary)).map(Employee::getSalary).ifPresent(System.out::println);


	}
	

}
