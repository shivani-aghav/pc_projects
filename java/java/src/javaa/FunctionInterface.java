package javaa;

import java.util.function.Function;
//function to return string length
public class FunctionInterface {

	public static void main(String[] args) {
		Function<String,Integer>i=s->s.length();
		System.out.println(i.apply("shivani"));
	}
}
