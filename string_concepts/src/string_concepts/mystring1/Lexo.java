package string_concepts.mystring1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lexo {

	public static void main(String[] args) {
		String s="AJKSDasbdKJSDBFsjnd";
		
		String collect = Stream.of(s.split("")).sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.joining());
		System.out.println(collect);
	}
}
