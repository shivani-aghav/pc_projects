package pattern.number;

public class Triangle3 {

	public static void main(String[] args) {

		int n = 7;
		for (int i = 1; i <= n; i++) {
			int k=i;
			for (int j = 1; j <= i; j++) {
				System.out.print(k+" ");
				k--;
			}
			System.out.println();
		}
	}
}
