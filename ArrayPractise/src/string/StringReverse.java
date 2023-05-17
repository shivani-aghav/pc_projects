package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringReverse {

	public static void main(String[] args) {

		String s = "Peaky Blinders";
		String reduce = Stream.of(s.split("")).reduce("",(t, u) ->u+t );
		System.err.println(reduce);
		
		for (int i = s.length()-1; i >=0; i--) {
			System.out.print(s.charAt(i));
		}
		
	
	
	}
}
