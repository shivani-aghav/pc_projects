package concepts;

import java.util.HashMap;
import java.util.Map;

public class DrawingBook {

	public static void main(String[] args) {
		int n=6;
		int p=2;
		
		Map<Integer, Integer> map = new HashMap<>();
		   
		int k=1;
		while (k<n) {
			map.put(k, k);
			k++;
		}
		map.put(n, n);
		System.out.println(map);
		
		
	}
}