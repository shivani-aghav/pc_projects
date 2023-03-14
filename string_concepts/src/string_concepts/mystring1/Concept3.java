package string_concepts.mystring1;

public class Concept3 {

	public static void main(String[] args) {
		/*
		 * java.lang.String class has static methods. They are, 1) copyValueOf() 2)
		 * format() 3) join() 4) valueOf() equals and hashcode method is overrided in
		 * string not in stringbuffer or builder join() is static method in String class
		 * Default capacity of stringbuffer is 16
		 */
		String[] strings = { "Java", "Python", "JavaScript", "HTML", "CSS" };
		String languages = String.join("_", strings);
		System.out.println(languages);
	

		StringBuffer sb = new StringBuffer("One Two Three Four Five");
		System.out.println(sb.reverse().indexOf("Two"));// returns the first occurence of string orElse returns -1
	}
}
