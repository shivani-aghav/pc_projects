package javaa;

public class Hii {

	public static void main(String[] args) {
		System.out.println(exe());
	}

	public static String exe() {
		try {
			return "a";
		} catch (Exception a) {
			return "b";
		} finally {
			return "c";
		}

	}
}
