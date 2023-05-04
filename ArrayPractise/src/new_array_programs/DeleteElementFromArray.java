package new_array_programs;

public class DeleteElementFromArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int element = 3;
        for (int i = 0; i < a.length; i++) {
			if (element==a[i]) {
				for (int j = i; j < a.length-1; j++) {
					a[j]=a[j+1];
				}                         
			}
		}
        for (int i = 0; i < a.length-1; i++) {
			System.out.println(a[i]);
		}
	}
}
