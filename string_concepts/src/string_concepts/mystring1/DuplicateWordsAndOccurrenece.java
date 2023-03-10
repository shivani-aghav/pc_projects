package string_concepts.mystring1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

//find duplicate words and their number of occurrences of them
public class DuplicateWordsAndOccurrenece {

	public static void main(String[] args) {
		String s = "Super Super Man Bat Man Spider Man";
		Stream.of(s.toLowerCase().split(" ")).collect(Collectors.groupingBy(String::valueOf)).entrySet().forEach(t -> {
			if (t.getValue().size() > 1) {
				System.out.println( t.getKey()+" : "+ t.getValue().size());
			}
		});
	}
}
