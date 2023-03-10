package java_8.features;

public class Regex3 {

	public static void main(String[] args) {
		String s = "He is a very very good boy, isn't he?";
        String ss = s.replaceAll("[@_?,'!#$]", " ");
        String sss = ss.replaceAll("  ", " ");
        String[] sp = sss.split(" ");
        System.out.println(sp.length);
        for (String string : sp) {
			System.out.println(string);
		}
	}
}
