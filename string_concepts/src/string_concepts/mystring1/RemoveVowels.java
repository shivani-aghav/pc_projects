package string_concepts.mystring1;

public class RemoveVowels {
	public static void main(String[] args) {
		String s = "shivani";
	/*	char[] c = s.toCharArray();
		List<Character> list = new ArrayList<>();
		for (int i = 0; i < c.length; i++) {
			if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o'
					&& s.charAt(i) != 'u') {
				list.add(s.charAt(i));
			}
		}
		System.out.println(list);  */
		
		//OR
		
		String all = s.replaceAll("[AEIOUaeiou]", ""); 
		System.out.println(all);
	}
}
