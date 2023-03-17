import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Frequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter size of array :");
		int[] a = new int[sc.nextInt()];

		System.out.println("enter values :");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("enter frequency :");
		int f=sc.nextInt();
		System.out.println(Arrays.toString(a));
		
		ArrayList<Object> list = new ArrayList<>();

		IntStream.of(a).boxed().collect(Collectors.groupingBy(t -> t)).entrySet().forEach(t -> {
		
			if (t.getValue().size() == f) {
				if (t.getValue().equals(t.getValue())) {
					list.add(t.getKey());
				}
			}
		});
		System.out.println(list);

	}
}
