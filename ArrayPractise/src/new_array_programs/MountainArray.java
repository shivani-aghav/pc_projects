package new_array_programs;

import java.util.stream.IntStream;

public class MountainArray {

	public static void main(String[] args) {
		int a[] = { 2, 4, 4, 5, 4, 3, 3, 1 };
		System.out.println(mountain(a));
	}

	private static boolean mountain(int[] a) {

		int peak = IntStream.of(a).max().getAsInt();
		boolean b = false;

		if (a.length < 3) {
			return false;
		}

		if (peak == a[0] || peak == a[a.length - 1]) {
			return false;
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] == peak && a[i] != a[i + 1] && a[i] != a[i - 1]) {

				for (int j = i; j > 0; j--) {
					if (a[j] < a[j - 1]) {
						return false;
					} else {
						b = true;
					}
				}
				for (int j = i; j < a.length - 1; j++) {
					if (a[j] < a[j + 1]) {
						return false;
					} else {
						b = true;
					}
				}
			}
		}
		return b;
	}
}
