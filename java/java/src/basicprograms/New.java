package basicprograms;

import java.util.ArrayList;

public class New {

	public static void main(String[] args) {

		int a = 1;
		try {
			int b = a / 0;
		} catch (NullPointerException e) {
//			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
