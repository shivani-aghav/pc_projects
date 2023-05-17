package pattern;

public class ButterFly {

	public static void main(String[] args) {
		int n = 9;
		int tmp=n;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 || i == j || i + j == n - 1 || j == n / 2 ) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}	
			System.out.println();
		}
	}
}
