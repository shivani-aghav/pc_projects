package string_concepts.mystring1;

public class Pal {

	public static void main(String[] args) {

		String s = "abba";

		String p = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			p += s.charAt(i);
		}
		if (p.equals(s)) {
			System.out.println("pal");
		}else {
			System.err.println("not");
		}
	}
}
