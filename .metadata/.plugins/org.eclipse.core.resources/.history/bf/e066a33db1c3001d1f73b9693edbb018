import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergeTwoArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("enter index : ");
//		int indx = sc.nextInt();
		System.out.print("enter values of array 1: ");
		int val = sc.nextInt();
//		System.out.print("enter index : ");
//		int indx1 = sc.nextInt();
//		System.out.print("enter values : ");
//		int val1 = sc.nextInt();
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 6, 7, 8, 9 };
		int c[] = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[i + a.length] = b[i];
		}
		System.out.println(Arrays.toString(c));
	
	}
}
