package string_concepts.mystring1;

import java.util.Arrays;

public class Concept4 {
	public static void main(String[] args) {
		String str = "Java Concept Of The Day";
		System.out.println(str.indexOf("Day"));
		System.out.println(str.indexOf("a", 5));// returns the first occurence of character from specified index(5)
		System.out.println(str.lastIndexOf('a'));// returns the last occurence of character if not found then returns -1
		System.out.println(str.replace("a", "A").lastIndexOf('a'));// here all a replaced by A so it did not find any a
																	// as last occurence

//		String str1 = null;
//		System.out.println(str1.isBlank());// throws null pointer exception

		String str2 = "123321123";
		System.out.println(str2.replaceFirst("123", "321").replaceAll("12", "21").substring(3, 6));

		String str1 = "Java J2EE Spring Hibenate SQL";
		String str3 = "Python Java Scala C C++";
		System.out.println(str1.contains("HTML") == str3.contains("HTML"));// false==false becomes true coz condition is
																			// true

		String[] strings = "Java_Concept_Of_The_Day".split("_", 3);//3-1=2 times remove _
		Arrays.stream(strings).forEach(System.out::println);
		
		//join
		System.out.println(String.join(",", "1", "2", "3").concat(",").repeat(3).lastIndexOf(','));
	}
}
