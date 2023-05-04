import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicatesInArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 4, 5, 8, 8, 6, 5, 6, 6 };

//		HashSet<Object> set = new HashSet<>();
//		for (int i = 0; i < a.length; i++) {
//			for (int j = i+1; j < a.length; j++) {
//				if (a[i]==a[j]) {
//					set.add(a[i]);
//				}
//			}
//		} 
//		System.out.println(set);

		Set<Integer> set = new HashSet<>();
		IntStream.of(a).boxed().filter(r -> !set.add(r)).distinct().collect(Collectors.toList())
				.forEach(System.out::println);
		// set.add(1) it will return true if again same element is added then set.add(1) it will return false
		// in negation ! false will become true and true will become false so if filter
		// condition is true then only it will go forward
	}
}
