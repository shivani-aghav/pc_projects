package string_concepts.mystring1;

public class AllSubstringsOfString {

	public static void main(String[] args) {
		String s="shivani";
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j <= s.length(); j++) {
				System.out.println(s.substring(i,j));
			}
		}
	}
}
