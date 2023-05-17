package string_concepts.mystring1;

import java.util.stream.Stream;

public class ReverseString {

	public static void main(String[] args) {
         String s="jaaaduuuuu";
         Stream.of(s.split("")).reduce((t, u) -> u+t+"").ifPresent(System.out::println);
         
         String s1="stupidjohn";
 		for (int i = s1.length()-1; i>=0; i--) {
			System.out.print(s1.charAt(i));
 		}
	}
}
