package new_array_programs;

import java.util.stream.IntStream;

//if neighbors are small
public class PickArray {
	public static void main(String[] args) {
		int[] a = { 10, 3, 2, 90 };

		int max = IntStream.of(a).max().getAsInt();
		System.out.println(max);
		
		for (int i = 1; i < a.length; i++) {
			if (a[i] == max && i != a.length - 1) {
				if (max > a[i + 1] && max > a[i - 1]) {
					System.out.println("The element " + max + " is greater than its neighbors.");
				} else {
					System.out.println("neibours are not smaller numbers ");
					break;
				}
			}
		}
		if (a[0] > a[1] && a[0] == max) {
			System.out.println("The element " + a[0] + " is greater than its neighbors.");
		} else if (a[a.length - 1] > a[a.length - 2] && a[a.length - 1] == max) {
			System.out.println("The element " + a[a.length - 1] + " is greater than its neighbors.");

		}
		
//		short s=10;
//		s=(short) (s*50);
//		System.err.println(s);
	}
}
