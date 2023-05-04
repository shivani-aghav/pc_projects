package new_array_programs;

import java.util.stream.IntStream;

public class Palindrome {

	public static void main(String[] args) {
//		int n=1221;
//		int tmp=0;
//		int m=n;
//		while(n>0) {
//			int s1 = n%10;
//			tmp=tmp*10+s1;
//			n=n/10;
//		}
//		if (tmp==m) {
//			System.out.println("palindrome");
//		}else {
//			System.out.println("not");
//		}

		System.out.println("--------------OR--------------");
		int n = 1241;
		int tmp = n;

		// reverse number using stream
		// iterate will give 1st value as it is
//		int reduce = IntStream.iterate(n, i -> i / 10).limit(4).map(i -> i % 10).reduce(0, (r, i) -> r * 10 + i);
//		System.out.println(reduce);
//		System.out.println("--------------OR--------------");

		String reduce2 = String.valueOf(n).chars().mapToObj(Character::getNumericValue).reduce("", (r, l) -> l+r,(r, p) -> r + p);
		if (Integer.valueOf(reduce2) == tmp) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not");
		}
		System.out.println(reduce2);

	}
}
