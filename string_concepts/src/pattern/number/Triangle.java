package pattern.number;

public class Triangle {

	public static void main(String[] args) {
		int n = 4;

		for (int i = 1; i <= n; i++) {
			int k = n;
			for (int j = n; j >= i; j--) {
				System.out.print(k + " ");
				k--;
			}
			System.out.println();
		}

		System.out.println("------------------1-");

		int w = n;
		for (int i = 1; i <= n; i++) {
			for (int j = w; j >= 1; j--) {
				System.out.print(j + " ");
			}
			w--;
			System.out.println();
		}

		System.out.println("------------------2-");
		
		
		
		
		
		
		
		
		
		
		
		
		

		for (int i = 1; i <= n; i++) {
			int s = n;
			for (int j = 1; j <= i; j++) {
				System.out.print(s + " ");
				s--;
			}
			System.out.println();
		}

		System.out.println("------------------3-");
		
		for (int i = 1; i <= n; i++) {
			int s = n;
			for (int j = 1; j <= i; j++) {
				System.out.print(s + " ");
				s--;
			}
			System.out.println();
		}
		
		System.out.println("------------------4-");
	}
}
