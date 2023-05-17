package string_concepts.mystring1;

public class IsRotatedString {

	public static void main(String[] args) {
		String org = "decode";
		String toBeChecked = "codede";
		checkForRotation(org, toBeChecked);
	}

	private static void checkForRotation(String org, String toBeChecked) {
		String concat = org.concat(org);
		if (concat.contains(toBeChecked)) {
			System.out.println("string is rotated of original");
		}

	}
}
