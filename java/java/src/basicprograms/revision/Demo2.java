package basicprograms.revision;

import java.util.Comparator;
import java.util.TreeMap;

public class Demo2 {

	public static void main(String[] args) {
		//Comparator.reverseOrder() to make the keys order reverse
          TreeMap<Integer,String> map = new TreeMap<>(Comparator.reverseOrder());
          map.put(18000, "A");
          map.put(17000, "D");
          map.put(21000, "E");
          map.put(12000, "C");
          map.put(15000, "F");
          
          //keys sorted 
          System.out.println(map);
       
          System.out.println(   map.lastKey());
          System.out.println(   map.firstKey());
          //prints values less than 15000
          System.out.println(map.headMap(15000).keySet());
          
          //prints values greater or equals to 15000
          System.out.println(map.tailMap(15000).keySet());
	}
}
