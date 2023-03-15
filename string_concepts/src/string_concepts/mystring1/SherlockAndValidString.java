package string_concepts.mystring1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SherlockAndValidString {

	public static void main(String[] args) {
		
		String s="abcdefghhgfedecba";
		
		Stream.of(s.split("")).collect(Collectors.groupingBy(t->t,Collectors.counting())).forEach((t, u) -> {
			if (u.longValue()!=u.longValue()) {
				System.out.println(t);
			}
		});;
	}
}