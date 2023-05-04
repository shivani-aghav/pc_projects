package string_concepts.mystring1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MostRepetitive {
	public static void main(String[] args) {
		String s = "Java Concept Of The Day";
		char[] c = s.toCharArray();

		Stream.of(s.replace(" ", "").split("")).collect(Collectors.groupingBy(t -> t)).entrySet().stream()
				.sorted((o1, o2) -> (o2.getValue().size() - o1.getValue().size())).findFirst()
				.ifPresent(x -> System.out.println(x.getKey() + " = " + x.getValue().size()));

		
	}
}
