package basicprograms;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFrequentEvenNumber {

	public static void main(String[] args) {

		int[] a = { 0, 5, 4, 4, 4, 4, 2, 2, 6, 6 };
		System.out.println(getFrequentEvenNo(a));
	}

	public static int getFrequentEvenNo(int[] a) {
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0 && a[i] != 0) {
				count++;
			}
		}
		int even[] = new int[count];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0 && a[i] != 0) {
				even[k] = a[i];
				k++;
			}
		}

	   Arrays.stream(even).boxed()
				.collect(Collectors.groupingBy(Integer::intValue, Collectors.counting())).entrySet()
				.forEach(System.out::println);
		

//		int count1 = 0;
//
//		for (int i = 0; i < even.length; i++) {
//			for (int j = i + 1; j < even.length; j++) {
//				if (even[i] == even[j]) {
//					count1++;
//				}
//			}
//		}

//		int singleEven[] = new int[count1];
//		int p = 0;
//		for (int i = 0; i < even.length; i++) {
//			for (int j = i + 1; j < even.length; j++) {
//				if (even[i] == even[j]) {
//					singleEven[p] = even[i];
//					p++;
//				}
//			}
//		}

//		if (singleEven.length == 1) {
//			return singleEven[0];
//		} else if (singleEven.length > 1) {
//			Arrays.sort(singleEven);
//			return singleEven[0];
//		} else {
//			return -1;
//		}
		return 0;
	}
}
