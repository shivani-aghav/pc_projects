package stream.stream1;

import java.util.Scanner;

public class SkipFirstLast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------Enter size of array------");
		int i = sc.nextInt();
		int[] a = new int[i];
		System.out.println("--------Enter values--------");
		
		for (int j = 0; j < a.length; j++) {
			a[j] = sc.nextInt();
		}
		int max=0;
		for (int j = 1; j < a.length; j++) {
			max=max+a[j];
		}
		System.out.println("max number is---->"+max);
		int min=0;
		for (int j = 0; j < a.length-1; j++) {
			min=min+a[j];
		}
		System.out.println();
		System.out.println("min number is---->"+min);
	}
}
