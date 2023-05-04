package basicprograms;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeMain {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee("Shivani","Chaya", "Subhash", Arrays.asList("Shivam","Shivani")));
		list.add(new Employee("Beduu","Manya", "Chandra", Arrays.asList("Renuald","Oliver")));
		
		
		list.stream().forEach(System.out::println);
	}
}
