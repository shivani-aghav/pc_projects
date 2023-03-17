package concepts;

public class Concept2 {

	public static void main(String[] args) {
		//this will be compiled
		int[] a = { 1 };

		int[] b[] = { { 1 } };

		int[][] c[] = { { { 1 } } };

		int[][] d[][] = { { { { 1 } } } };
		int n=-100;
		String s=String.valueOf(n);
		
		System.out.println(n==Integer.parseInt(s));
	}
}
