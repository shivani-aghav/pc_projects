package concepts;

import java.util.Scanner;

public class JavaLoopsII {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("enter values");
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			System.out.print("enter a :");
			int a = in.nextInt();
			System.out.print("enter b :");
			int b = in.nextInt();
			System.out.print("enter n :");
			int n = in.nextInt();

			
				int x = 1;
				int m = a + 1 * b;

				for (int j = 0; j < n; j++) {
					System.out.print(m + " ");
					x = x * 2;
					m = m + x * b;
				}
				System.out.println();
			
			
			
		}

	}
}
