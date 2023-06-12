import java.util.Arrays;

public class GeeksString1 {

	public static void main(String[] args) {

		String s = "i.like.this.program.very.much";

		String[] split = s.split("\\.");
		System.out.println(Arrays.toString(split));
		for (int i = split.length-1; i >=0; i--) {
			System.out.print(split[i]+".");
		}

	}
}
