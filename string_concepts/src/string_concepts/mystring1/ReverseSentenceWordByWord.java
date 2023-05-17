package string_concepts.mystring1;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseSentenceWordByWord {

	public static void main(String[] args) {
		
		String s="Concept Of the Day";
		
		
//		Stream.of(s.split(" ")).reduce((t, u) -> u+" "+t).ifPresent(System.out::println);//reversed string without reversing each word
		
		String collect = IntStream.range(0, s.length()).boxed().sorted(Collections.reverseOrder()).map(t -> String.valueOf(s.charAt(t))).collect(Collectors.joining()); 
		System.out.println(collect);
		
	}
}
