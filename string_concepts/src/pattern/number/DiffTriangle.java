package pattern.number;

public class DiffTriangle {

	public static void main(String[] args) {
		int n = 4;
		int m = 1;
		for (int i = 1; i <= n; i++) {
			int d = 1;
			for (int j = 1; j <= m; j++) {
				if (d <= i) {
					System.out.print(d + " ");
					d++;
				} else {
					d = d - 2;
					System.out.print(d + " ");
					d--;
				}
			}
			m += 2;
			System.out.println();
		}
	}
}
