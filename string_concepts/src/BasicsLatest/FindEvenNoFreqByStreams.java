package BasicsLatest;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindEvenNoFreqByStreams {

	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 5, 4, 3, 4, 4 };

//		int k = 0;
//		HashMap<Integer, Integer> map = new HashMap<>();
//		for (int i = 0; i < a.length; i++) { 
//			if(!map.containsKey(a[i])) {
//				k=0;
//			}
//			map.put(a[i], k+1);
//			k++;
//		}
//		System.out.println(map);
		Arrays.stream(a).boxed().filter(s -> s % 2 == 0).collect(Collectors.groupingBy(f -> f, Collectors.counting()))
				.entrySet().forEach(System.out::println);;
//				.entrySet().stream().forEach(dd -> {
//					if (dd.getValue() == Arrays.stream(a).boxed().filter(s -> s % 2 == 0)
//							.collect(Collectors.groupingBy(f -> f, Collectors.counting())).entrySet().stream()
//							.map(s -> s.getValue()).collect(Collectors.summarizingInt(ff -> ff.intValue())).getMax()) {
//						System.out.println(dd.getKey());
//					}
//				});
	}
}
