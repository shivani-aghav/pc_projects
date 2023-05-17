package string_concepts.mystring1;

public class Concept5 {

	public static void main(String[] args) {
		String s1 = new String("JAVA");
		String s2 = new String("JAVA");
		String s3="JAVA";
		String s4="JAVA";
		System.err.println(s1.equals(s2));
		System.err.println(s1==s2);
		System.err.println(s3.equals(s4));
		System.err.println(s3==s4);
	}
}
