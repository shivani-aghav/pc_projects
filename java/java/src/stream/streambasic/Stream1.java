package stream.streambasic;

import java.util.stream.IntStream;
//IntStream.range() , IntStream.rangeClosed()
public class Stream1 {

	public static void main(String[] args) {
		IntStream.range(1, 10).forEach(System.out::println);
		System.out.println("----------");
		IntStream.rangeClosed(1, 10).forEach(System.out::println);
		System.out.println("----------");
		IntStream.rangeClosed(1, 10).skip(5).forEach(System.out::println);
		System.out.println("----------");
		int sum = IntStream.rangeClosed(1, 5).sum();
		System.out.println(sum);
		
		
	}
}
