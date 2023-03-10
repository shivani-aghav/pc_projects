package string_concepts.mystring1;

public class Concept2 {

	public static void main(String[] args) {
		String s = "java";
		String i = s.intern();
		System.err.println(i.hashCode() == s.hashCode());
		System.out.println("----------------");

		String s1 = new String("JAVA");// new obj creates in scp
		String s2 = new String("JAVA");// new obj creates in scp
		System.out.println(s1 == s2);// ref is diff so false
		System.out.println(s1.equals(s2));// content is same so true
		System.out.println(s1 == s2.intern());
		System.out.println(s1.intern() == s2.intern());
		System.out.println(s1.intern() == s2);
		System.out.println("----------------");
		
	}
}
