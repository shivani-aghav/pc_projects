package pattern.number;

public class Curtain {

	public static void main(String[] args) {
		int n = 7;
//		int s = n;
//		for (int i = 1; i <= n * 2 - 1; i++) {
//			int k = 1;
//			int d = 1;
//			for (int j = 1; j <= n; j++) {
//				if (i <= (n * 2) / 2 && k <= s) {
//					System.out.print(j + " ");
//					k++;
//				} else if (i > (n * 2) / 2 && j <= i - 3) {
//					System.out.print(j + " ");
//				}
//			}
//			s--;
//			System.out.println();
//		}

		System.out.println("---------------------------");
		int k = n / 2 + 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= k; j++) {
				System.out.print(j + " ");
			}
			if (i <= n / 2) {
				k--;
			} else
				k++;
			System.out.println();
		}

	}
}
