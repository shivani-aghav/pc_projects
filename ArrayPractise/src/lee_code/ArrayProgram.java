package lee_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayProgram {

	public static void main(String[] args) {
		int[] a = { 2,7,11,15 };
		int target = 9;
		int[] n = name(a,target);
        System.out.println(Arrays.toString(n));
	}

	public static int[] name(int[] a, int target) {

		List<Integer> al = new ArrayList<>();
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] + a[j] == target) {
                  al.add(i);
                  al.add(j);
				}
			}
		}
		int[] array = al.stream().mapToInt(t -> t).toArray();
		return array;

	}
}
