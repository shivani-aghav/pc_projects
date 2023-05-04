package javaa;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lambdaa {

	public static void main(String[] args) {
		
		
		
		
		
		
		
//		Runnable runnable= ()-> System.out.println("bbbb");
//		runnable.run();

		List<Integer> list = Arrays.asList(12, 34, 54, 23, 55);
		IntSummaryStatistics collect = list.stream().collect(Collectors.summarizingInt(t -> t));
		System.out.println(collect.getMax());
		
	IntStream.rangeClosed(1, 10).forEach(a-> {a=a*2;
		if (a%4==0) {
			System.err.println(a);
		}else {
			System.out.println(a);
			
		}
	});
	}
}
