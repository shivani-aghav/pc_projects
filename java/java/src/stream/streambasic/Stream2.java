package stream.streambasic;

import java.util.Arrays;
import java.util.stream.Stream;

public class Stream2 {

	public static void main(String[] args) {
		Stream.of("Hema", "Rekha", "Jaya", "Sushma").sorted().findFirst().ifPresent(System.out::println);
		System.out.println("-------------------------------");
		String[] names = { "Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah" };
		Arrays.asList(names).stream().filter(t -> t.startsWith("S")).sorted().forEach(System.out::println);
		System.out.println("-------------------------------");
		Arrays.asList(names).stream().map(String::toLowerCase).filter(t -> t.startsWith("a"))
				.forEach(System.out::println);
		System.out.println("-------------------------------");
		 Arrays.stream(new int[] {2, 4, 6, 8, 10}).map(x->x*x).average().ifPresent(System.out::println);
	}
}
