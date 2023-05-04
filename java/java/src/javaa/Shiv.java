package javaa;

import java.util.Scanner;

class Shiv {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int b=0;
		System.out.println("-------declare size of array------");
		
		b=sc.nextInt();
		
		int []a=new int[b];
		for (int i = 0; i < a.length; i++) {
			System.out.println(i);
		}
	}
	
}
