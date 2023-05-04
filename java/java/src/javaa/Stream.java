package javaa;

import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
	List<Integer> n=Arrays.asList(2,3,4,5);
	
//	n.stream().map(x-> 2*x).collect(Collectors.toSet()).forEach(System.out::println);;
	 
	List<String> m=Arrays.asList("Shivani","Komal","Navaj","Sunita","rohannn");
	
//	m.stream().filter(x->x.startsWith("S")).forEach(System.out::println);
	
	Set<Entry<Integer, List<String>>> entrySet = m.stream().filter((s)->s.startsWith("S")).collect(Collectors.groupingBy(String::length)).entrySet();
	System.out.println(entrySet);

//	m.stream().sorted().forEach(System.out::println);
	}
}
