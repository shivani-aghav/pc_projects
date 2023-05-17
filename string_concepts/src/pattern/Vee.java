package pattern;

public class Vee {

	public static void main(String[] args) {
		int n = 10;
		int s = n - 1;
		for (int i = 0; i < n / 2 +1; i++) {
			for (int j = 0; j < n; j++) {
				if (i==j) {
					System.out.print("* ");
				}
				if (j == s) {
					System.out.print("* ");
					s--;
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
