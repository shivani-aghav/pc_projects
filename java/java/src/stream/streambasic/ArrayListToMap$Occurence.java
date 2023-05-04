package stream.streambasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//list to map or occurence of elements
public class ArrayListToMap$Occurence {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,1,2,3,2,4,7);
		System.out.println(list);
		Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(t->t,Collectors.counting()));
		System.out.println(map);
	}
}
