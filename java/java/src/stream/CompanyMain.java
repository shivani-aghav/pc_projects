package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CompanyMain {

	public static void main(String[] args) {
		List<Company> list = Arrays.asList(new Company("Shivani", 24, "Java Developer"),
				new Company("Komal", 11, "Testing"), new Company("Rinky", 40, "Devops"),
				new Company("Pinky", 7, "Testing"), new Company("Rohan", 13, "Devops"),
				new Company("Sushma", 8, "Devops"), new Company("Nawaj", 4, "Java Developer"));

		list.stream()
				.collect(Collectors.groupingBy(Company::getDept,
						Collectors.mapping(Company::getEmpName, Collectors.toList())))
				.entrySet().forEach(System.out::println);
	}
}
