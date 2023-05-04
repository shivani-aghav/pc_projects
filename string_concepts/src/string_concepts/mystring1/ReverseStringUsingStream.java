package string_concepts.mystring1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Stream;

public class ReverseStringUsingStream {

	public static void main(String[] args) {

//		List<String> list = Arrays.asList("java", "ruby", "angular", "java", "ruby", "python");
//		List<Integer> list2 =  new ArrayList<>();
//		list2.add(1);list2.add(7);list2.add(3);list2.add(2);
//
////		list.stream().distinct().forEach(System.out::println);
////		list2.stream().sorted((o1, o2) -> o2.intValue()-o1.intValue()).skip(1).findFirst().ifPresent(System.out::println);
//		Collections.sort(list2);
//		Collections.reverse(list2);
//		System.out.println(list2.get(1));

//		List<Integer> asList = Arrays.asList(15,36,54,78,98,98,98,98,98,98,65,42);
//	TreeSet<Integer> set=new TreeSet<>(asList);
//	List<Integer> a = new ArrayList<>(set);
//	System.err.println(a.get(a.size()-1));

//	asList.stream().sorted((o1, o2) -> o2-o1).distinct().skip(1).findFirst().ifPresent(System.out::println);

	 String reduce = Stream.of("rohan".split("")).reduce("",(a,b)->b+a);
	 System.err.println(reduce);

//		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5);
//		asList.stream().reduce(Integer::sum).ifPresent(System.out::println);

		Arrays.asList("Alberto", "Daisy", "DavidRaj", "Daniel", "Lewis", "Sanya", "Edward").stream()
				.reduce((t, u) -> t.length() > u.length() ? t : u).ifPresent(System.out::println);

	}
}
