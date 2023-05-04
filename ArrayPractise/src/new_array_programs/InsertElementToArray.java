package new_array_programs;
//shift from last till position
public class InsertElementToArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int n=90; 
		int pos=1;
		for (int i = a.length-1; i >pos-1; i--) {
			a[i]=a[i-1];
		}
		a[pos-1]=n;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
