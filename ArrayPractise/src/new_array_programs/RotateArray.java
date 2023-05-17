package new_array_programs;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int a[] = { 4, 5, 6, 7, 8, 9 };
		System.err.println(Arrays.toString(a));
		int rot = 3;
		String string = "";
		for (int i : a) {
			string += i;
		}
		String s = string.substring(a.length - rot, a.length);
		for (int i = 0; i < a.length - rot; i++) {
			s += string.charAt(i);
		}
		for (int i = 0; i < a.length; i++) {
             a[i]=Integer.parseInt(""+s.charAt(i));			
		}
		System.err.println(s);
		System.err.println(Arrays.toString(a));
	}
}
