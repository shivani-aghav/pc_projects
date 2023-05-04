package stream.stream1;

public class Logical1 {

	public static void main(String[] args) {
		int[] a = { 1, 1, 0, -1, -1 };
		float b=0;
		float c=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]>0) {
				b=b+a[i];
			}else if (a[i]<0) {
				c=c+a[i];
			}else {
				System.out.println(a[i]/a.length);
			}
		}
		System.out.println("+ve no :"+b/a.length);
		System.out.println("-ve no :"+c/a.length);
	}
}
