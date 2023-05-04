package basicprograms.revision;

public class EqualsHashCodeContract {

	public static void main(String[] args) {

		String s1 = new String("Aa");
		String s2 = "BB";
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}
}
