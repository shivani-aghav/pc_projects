package pattern;

public class UltaPyramid {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			
			for (int j = 2; j <= i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k <= 4; k++) {
                 System.out.print("* ");
			}
			for (int j = i; j < 4; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}