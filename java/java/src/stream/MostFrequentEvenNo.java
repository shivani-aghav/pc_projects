package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class MostFrequentEvenNo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 6, 4, 4, 2, 2, 6);
	

//		list.stream().filter(t -> t % 2 == 0).collect(Collectors.toList());

		Map<Integer, Long> collect = list.stream().filter(t -> t % 2 == 0)
				.collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));

		Optional<Entry<Integer, Long>> max = collect.entrySet().stream().max((o1, o2) -> o1.getValue().compareTo(o2.getValue()));
		System.out.println(max);
	
	}
}
