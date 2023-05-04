package basicprograms;

public class StringOccurence {

	public static void main(String[] args) {
		
		String s="my name is shivani and my job is at bangalore";
		String name="is";
		String[] split = s.split(" ");
		int count=0;
		for (int i = 0; i < split.length; i++) {
			if (name.equals(split[i])) {
				count++;
			}
		}
		System.out.println(count);
	}
}
