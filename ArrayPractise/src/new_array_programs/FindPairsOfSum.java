package new_array_programs;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindPairsOfSum {

	public static void main(String[] args) {
		int n[] = { 12, 13, 10, 15, 8, 40, -15 };
		int sum = 25;

		for (int i = 0; i < n.length; i++) {
			for (int j = i + 1; j < n.length; j++) {
				if (n[i] + n[j] == sum) {
					System.out.println("[" + n[i] + "," + n[j] + "]");
				}
			}
		}
		System.out.println("----------OR----------");
		for (int s = 0; s < n.length; s++) {
		final int i = s;
			IntStream.of(n).boxed().filter(t -> t + n[i] == sum).collect(Collectors.toList()).forEach(System.out::println);
		}
	}
}
