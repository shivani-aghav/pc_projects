package string_concepts.mystring1;

import java.util.stream.Collectors;

public class FrequencyOfCharacters {

	public static void main(String[] args) {
	    //counting characters 
		"my name is khan".chars().mapToObj(t -> (char) t).collect(Collectors.groupingBy(x -> x, Collectors.counting())).entrySet()
				.forEach(System.out::println);
		
	}
}
