

import java.util.Arrays;
import java.util.stream.IntStream;

public class SameElementsInTwoArray {

	//same elements in both array
	public static void main(String[] args) {	
		int a[]= {2,8,3,4,6,7,7,8,9};
		int []b= {5,6,3,2,4,2};
		
		IntStream.of(a).filter(z->IntStream.of(b).anyMatch(c->c==z)).forEach(System.out::println);
		
		
		System.out.println("------------------addition of string 2, 2----------------------");
		
		int sum = Arrays.stream("2, 2".split(",")).mapToInt(s->Integer.parseInt(s.trim())).sum();
		System.out.println(sum);
	}
}
   