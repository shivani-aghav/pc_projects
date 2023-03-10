package java_8.features;

import java.util.Scanner;

public class Hacker1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter");
		int n1 = 0;
		int n2 = 0;
		try {
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			System.out.println(n1/n2);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("java.lang.ArithmeticException: / by zero");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("java.util.InputMismatchException");
		}

	}
}
