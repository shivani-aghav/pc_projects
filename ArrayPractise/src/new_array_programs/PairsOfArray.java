package new_array_programs;

public class PairsOfArray {

	public static void main(String[] args) {
		
		int a[] = { 1, 2, 3 };
		int n[] = { 3, 4 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < n.length; j++) {
				System.out.println("(" + a[i] + "," + n[j] + ")");
			}
		}
		
	}
}
