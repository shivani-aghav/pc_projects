package stream;

import java.util.Map;
import java.util.TreeMap;

public class SortingWordWise {

	public static void main(String[] args) {
		String st = "Welcome to TechnoElevate ot was is si";
		String[] split = st.split(" ");

		Map<Integer, String> map = new TreeMap<>();

		for (int i = 0; i < split.length; i++) {

			String s = split[i];
			int sum = 0;
			for (int j = 0; j < s.length(); j++) {
		       
			}
			map.put(sum, s);
		}
	}
	
}
