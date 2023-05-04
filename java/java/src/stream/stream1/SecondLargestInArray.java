package stream.stream1;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SecondLargestInArray {

	public static void main(String[] args) {
		int[] a = { 27, 34, 67, 33, 86, 23 };
	    List<Integer> list = IntStream.of(a).boxed().sorted().collect(Collectors.toList());
	    Collections.reverse(list);
	    System.out.println(list);
	    System.out.println("------------------------------");
	    list.stream().skip(1).findFirst().ifPresent(System.out::println);
	}
}
