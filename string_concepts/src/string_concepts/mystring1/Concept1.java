package string_concepts.mystring1;

public class Concept1 {

	public static void main(String[] args) {
		String st = " ";
		System.out.println(st.isBlank());// true
		System.out.println(st.isEmpty());// false
		System.out.println("----------------------");

		String s1 = "null" + null + 1;
		System.out.println(s1);
		System.out.println("----------------------");

		System.out.println("ONE" + 2 + 3 + 4 + "FIVE");
		System.out.println("----------------------");

		System.out.println("A".compareTo("B"));// -1
		System.out.println("B".compareTo("A"));// 1
		System.out.println("----------------------");
		
		//repeat()
		String s="5".repeat(7);
		System.out.println(s);
		System.out.println("----------------");

		"ABC123abc".chars().forEach(System.out::println);
		System.out.println("----------------------");

		System.out.println("ABC" + 1000 + 2000 + 3000);
		System.out.println("----------------");
		
//		String s2=1+null+"null"; will throw error
		
		System.out.println("java"==new String("java"));//false
		System.out.println("java"=="java");//true
		System.out.println("----------------");
		
		String s2="Java\tConcept\tOf\tThe\tDay".strip();
		System.out.println(s2);
		System.out.println("----------------");
		
		  String str1 = "Java";
	         
	        String str2 = new String("Java");
	         
	        System.out.println(str2.hashCode());
	}
}
