package lee_code;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int x = sc.nextInt();
		int te=x;
		if(x<0) {
			x=x*-1;
		}
		StringBuffer buffer=new StringBuffer(x+"");
		StringBuffer reverse = buffer.reverse();
		String string = reverse.toString();
		
		int parseInt = Integer.parseInt(string);
		if(te<0) {
			parseInt=parseInt*-1;
		}
		System.out.println(parseInt);
//		long p=x;
//		System.out.println(name(p));
		
	}
	
//	public static int name(long p) {
//		long tmp = p;
//		long i = 0;
//		long f=0;
//		while (tmp > 0||tmp<0) {
//			i = tmp % 10;
//			tmp = tmp / 10;
//			f=(f*10)+i;
//		}
//		int c=(int)f;
//		return (int) f;
//		
//		
//	}
}
