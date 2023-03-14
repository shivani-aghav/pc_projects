package concepts;

import java.util.Arrays;

public class Concept1 {

	public static void main(String[] args) {
		int[] i = new int[0];
//		System.out.println(i[0]); ArrayIndexOutOfBoundsException
		System.out.println("----------------");

		int[] a = new int[3];
		a[1] = 50;
		Object o = a;
		System.out.println(Arrays.toString((int[])o));//array downcasting
		int[] b = (int[]) o;
		b[1] = 100;
		System.out.println(a[1]);
		((int[]) o)[1] = 500;
		System.out.println(a[1]);
	}
}
