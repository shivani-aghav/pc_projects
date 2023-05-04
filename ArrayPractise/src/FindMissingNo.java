import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMissingNo {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 6, 7, 8, 10 };

	/*	for (int i = 1; i < a.length; i++) {
			if (a[i] - a[i - 1] == 1) {
				
			} else {
				System.out.println(a[i-1] + 1);
			}
		}*/
		
//		             OR
		
		List<Integer> col = Arrays.stream(a).boxed().sorted().collect(Collectors.toList());
		
		IntStream.rangeClosed(0, 10).filter(v -> !(col.contains(v))).forEach(System.out::println);
	}
}
