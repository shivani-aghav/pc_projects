package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Division {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 6, 4, 5, 12, 56, 33, 6, 2, 4);

		List<Integer> collect = list.stream().filter(a -> a % 3 == 0).collect(Collectors.toList());
		collect.stream().forEach(System.out::println);
	}
}
