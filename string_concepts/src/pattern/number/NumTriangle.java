package pattern.number;

public class NumTriangle {

	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
               System.out.print(i +" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		
		int p=1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
               System.out.print(p +" ");
               p++;
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		
		for (int i = 1; i <= n; i++) {
			int s=1;
			for (int j = 1; j <= i; j++) {
               System.out.print(s +" ");
               s++;
			}
			System.out.println();
		}
		System.out.println("---------------");
		
		for (int i = 1; i <= n; i++) {
			int s=i;
			for (int j = 1; j <= i; j++) {
				System.out.print(s +" ");
				s--;
			}
			System.out.println();
		}
		
	}
}
