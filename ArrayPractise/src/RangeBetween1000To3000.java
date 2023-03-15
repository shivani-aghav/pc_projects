import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RangeBetween1000To3000 {

	public static void main(String[] args) {

		/*
		 * List<Integer> list = new ArrayList<>(); for (int i = 1000; i <=3000; i++) {
		 * list.add(i); } String s[]=new String[list.size()];
		 * 
		 * for (int i = 0; i < list.size(); i++) { s[i]=list.get(i)+""; } for (int i =
		 * 0; i < s.length; i++) { int k=0; while (k<4) { if
		 * (s[i].charAt(k)=='0'||s[i].charAt(k)=='2'||s[i].charAt(k)=='4'||s[i].charAt(k
		 * )=='6'||s[i].charAt(k)=='8') { System.out.println(s[i]); break; } k++; } }
		 */

		IntStream.range(1000, 3001).boxed().collect(Collectors.toList()).forEach(t -> {
			if (t % 2 == 0) {
				System.out.println(t);
			} else {
				String z = t + "";
				if (Stream.of(z.split(""))
						.anyMatch(d -> d.equals("2") || d.equals("4") || d.equals("6") || d.equals("8"))) {
					System.out.println(z);
				}
			}

		});

	}
}