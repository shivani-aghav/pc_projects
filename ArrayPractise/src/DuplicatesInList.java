

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//if the frequency is greater than 1
public class DuplicatesInList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 7, 8, 1, 3, 5, 3);
//		Set<Integer> set = new HashSet<>();
//		list.stream().filter(a -> !set.add(a)).collect(Collectors.toList()).forEach(System.out::println);

		Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
		System.out.println("-----------Occurence > 1------------");
		//gives key and value pair both
//		map.entrySet().stream().filter(t -> t.getValue()>1).collect(Collectors.toList()).forEach(System.out::println);
		//gives key which are values in actual
//		map.entrySet().stream().filter(t -> t.getValue()>1).map(t -> t.getKey()).collect(Collectors.toList()).forEach(System.out::println);;
		//another way of getting occurence > 1
		list.stream().filter(t -> Collections.frequency(list, t)>1).collect(Collectors.toSet()).forEach(System.out::println);

		 
	}
}
