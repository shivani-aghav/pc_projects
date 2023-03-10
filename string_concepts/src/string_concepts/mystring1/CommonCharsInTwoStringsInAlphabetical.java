package string_concepts.mystring1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonCharsInTwoStringsInAlphabetical {

	public static void main(String[] args) {
	/*	String s1 = "thick bricks";
		String s2 = "thin sticks";
         
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		TreeSet<Character> tr = new TreeSet<>();
		for (int i = 0; i < c1.length; i++) {
			for (int j = 0; j < c2.length; j++) {
				if (c1[i]==c2[j]&&c1[i]!=' '&&c2[j]!=' ') {
					tr.add(c1[i]);
				}
			}
		}
		System.out.println(tr);*/
		
		String a = "thick bricks";
		String b = "thin sticks";

		System.out.println(Stream.of(a.replace(" ", "").split(""))
				.filter(B -> Stream.of(b.replace(" ", "").split("")).anyMatch(t -> B.equals(t))).sorted().distinct()
				.collect(Collectors.toList()));		
		
	}
}
