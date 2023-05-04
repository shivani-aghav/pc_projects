package new_array_programs;

import java.util.stream.IntStream;

//if neibours of biggest are small
public class BiggestNeibours {

	public static void main(String[] args) {
		int a[] = { 13, 101, 11, 12 };
		int max = IntStream.of(a).max().getAsInt();
		System.out.println(max);
		for (int i = 0; i < a.length; i++) {
			if (a[i] == max && i == 0) {
				if (max > a[i + 1]) {
					System.out.println("neibours are smallers");
					break;
				} else {
					System.out.println("not smallers");
					break;
				}
			} else if (a[i] == max && i == a.length - 1) {
				if (max > a[i - 1]) {
					System.out.println("neibours are smallers");
					break;
				} else {
					System.out.println("not smallers");
					break;
				}
			} else if(a[i] == max ) {
				if (max > a[i - 1] && max > a[i + 1]) {
					System.out.println("neibours are smallers");
					break;
				}else {
					System.out.println("not smallers");
					break;
				}
			}
		}
	}
}
