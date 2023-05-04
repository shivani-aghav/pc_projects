package new_array_programs;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class SecondLargestInArray {

	public static void main(String[] args) {

		System.out.println(secondLargest(new int[] { 12, 34, 54, 54, 37, 65, 33, 65 }));
		System.out.println("-------------------OR---------------------");

		
		int[] a = { 12, 34, 54, 54, 37, 65, 33, 65 };
		TreeSet<Integer> set = new TreeSet<>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		System.out.println(set.toArray()[set.size() - 2]);

		System.out.println("--------------------OR----------------------");

		IntStream.of(a).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.ifPresent(System.out::println);

	}

	private static int secondLargest(int[] a) {

		int firstL = 0;
		int secondL = 0;
		if (a[0] > a[1]) {
			firstL = a[0];
			secondL = a[1];
		} else if (a[0] < a[1]) {
			firstL = a[1];
			secondL = a[0];
		}

		for (int i = 2; i < a.length; i++) {
			if (a[i] > firstL) {
				secondL = firstL;
				firstL = a[i];
			} else if (a[i] < firstL && a[i] > secondL) {
				secondL = a[i];
			}
		}
		return secondL;
	}
}
