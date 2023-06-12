package string_concepts.mystring1;

public class LongestCommonSubstring {

	public static void main(String[] args) {
		String s1 = "ABCDGH";
		String s2 = "ACDGHR";

		int n = 0;
		int m = s1.length();
		System.out.println(m);

		while (n != m) {
			CharSequence subSequence = s1.subSequence(n, m);
			if (s2.contains(subSequence)) {
				System.out.println("the longest subsequence " + subSequence + " has length : " + subSequence.length());
			}
			n++;
		}
	}
}
