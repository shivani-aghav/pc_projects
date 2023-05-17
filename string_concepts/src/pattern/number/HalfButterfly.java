package pattern.number;

public class HalfButterfly {

	public static void main(String[] args) {
		int n = 7;
		int s = n / 2 + 1;

		for (int i = 1; i <= n; i++) {
			int k = 1;
			for (int j = 1; j <= i; j++) {
				if (i <= n / 2 + 1) {
					System.out.print(k + " ");
					k++;
				} else {
					if (k < s) {
						System.out.print(k + " ");
						k++;
					} else {
						s--;
						break;
					}
				}
			}
			System.out.println();
		}
	}
}
