package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastCollection {

	public static void main(String[] args) {
		CopyOnWriteArrayList list = new CopyOnWriteArrayList();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");

		Iterator<String> i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
//			list.add("five"); 
			list.remove("one"); 
//			list.set(1, "pangaa"); // wont throw exception
		}

//		Map<Integer, String> map = new ConcurrentHashMap();
//		map.put(1, "one");
//		map.put(2, "two");
//		map.put(3, "three");
//		map.put(4, "four");
//		Iterator<Map.Entry<Integer, String>> i2 = map.entrySet().iterator();
//		while (i2.hasNext()) {
//			Map.Entry<Integer, String> next = i2.next();
//			System.out.println(next.getKey() + " -->" + next.getValue());
//			map.remove(5, "five");
//		}

	}

}
