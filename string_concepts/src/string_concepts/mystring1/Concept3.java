package string_concepts.mystring1;

public class Concept3 {

	public static void main(String[] args) {
		//equals and hashcode method is overrided in string not in stringbuffer or builder
		// join() is static method in String class

		String[] strings = { "Java", "Python", "JavaScript", "HTML", "CSS" };

		String languages = String.join("_", strings);

		System.out.println(languages);
	}
}
