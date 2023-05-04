package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CricketersMain {

	public static void main(String[] args) {
 
		List<Cricketers> list = new ArrayList<>();
		list.add(new Cricketers("Sachin Tendulkar", 12, 120));
		list.add(new Cricketers("Mahi Dhoni", 5, 50));
		list.add(new Cricketers("Virat Kohli", 2, 110));
		list.add(new Cricketers("Rohit Sharma", 9, 80));

		Scanner scanner=new Scanner(System.in);
		System.out.println("-----enter jersy number-----");
		int int1 = scanner.nextInt();
		
		list.stream().filter(t -> t.getJersyNo()==int1).forEach(System.out::println);
		System.out.println();
		System.out.println();
		System.out.println();
		
		list.stream().sorted((o1, o2) -> o1.getScore()-o2.getScore()).collect(Collectors.toList()).forEach(System.out::println);
		
		List<String> s = new ArrayList<>();
         s.add("gulabi");
         s.add("nila");
         s.add("parwa");
         s.add("jambhla");
         s.stream().sorted( ).forEach(System.out::println);
		
	}
}
