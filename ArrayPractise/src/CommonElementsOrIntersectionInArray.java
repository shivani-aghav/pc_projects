import java.util.Arrays;
import java.util.HashSet;

//common elements in two array
public class CommonElementsOrIntersectionInArray {

	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5, 6, 7 };
		int[] b = { 8, 1, 2, 6, 0, 4, 6, 5 };
		HashSet<Object> set = new HashSet<>();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					set.add(a[i]);
				}
			}
		}
		System.out.println(set);

		System.out.println("--------OR---------");

		Integer[] i1 = { 1, 2, 3, 4, 5, 4 };

		Integer[] i2 = { 3, 4, 5, 6, 7, 4 };

		HashSet<Object> set1 = new HashSet<>(Arrays.asList(i1));
		HashSet<Object> set2 = new HashSet<>(Arrays.asList(i2));
		set1.retainAll(set2);
		System.out.println(set1);

	}
}
