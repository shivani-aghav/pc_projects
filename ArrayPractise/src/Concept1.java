import java.util.Arrays;

public class Concept1 {

	public static void main(String[] args) {
		int a[] = new int[10];
		int[] b = new int[100];
		a = b;
		System.out.println(a.length);

		// anonymous array - which has no reference
		System.out.println(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }.length);
		System.out.println(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }[4]);// index

		
		System.out.println(Arrays.toString(a));
	}
}
