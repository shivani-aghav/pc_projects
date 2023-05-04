package new_array_programs;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicatesInArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 4, 5, 8, 8, 6, 5, 6, 6 };

		HashSet<Object> set = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					set.add(a[i]);
				}
			}
		} 
		System.out.println(set);
		System.out.println("------------OR-------------");

		// set.add(1) it will return true if again same element is added then set.add(1) it will return false
		// in negation ! false will become true and true will become false so if filter
		// condition is true then only it will go forward
		Set<Integer> set1 = new HashSet<>();
		IntStream.of(a).boxed().filter(r -> !set.add(r)).distinct().collect(Collectors.toList())
				.forEach(System.out::println);
		
		
		System.out.println("------------OR--------------");
		
		List<Integer> as = Arrays.asList( 1, 2, 3, 4, 4, 5, 8, 8, 6, 5, 6, 6 );
		as.stream().filter(c-> Collections.frequency(as, c)>1).distinct().forEach(System.out::println);
		/*
		 * long sum = as.stream().collect(Collectors.summarizingInt(t->t)).getSum();
		 * System.err.println(sum);
		 */
		as.stream().max(Comparator.comparing(Integer::intValue)).ifPresent(System.out::println);
		as.stream().filter(w->Collections.frequency(as, w)>1).distinct().forEach(System.out::println);
	}
}
