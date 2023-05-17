package pattern;

public class Butterfly1 {

	public static void main(String[] args) {

		int n = 7;
		int sp = 0;
		int tmp = n;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < sp; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < tmp; j++) {
				System.out.print("* ");
			}
			if (i < n / 2) {
				sp++;
				tmp = tmp - 2;
			}else {
				sp--;
				tmp=tmp+2;
			}
			System.out.println();
		}
	}
}
