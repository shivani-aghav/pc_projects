import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class FindGreatestNoAndItsFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter size of array :");
		int[] a = new int[sc.nextInt()];
		
		System.out.println("enter values :");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		int big=0;
		int count=0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					big=a[i];
				}
			}
		}
		System.out.println("Largest element : "+big);
		for (int i = 0; i < a.length; i++) {
			if (big==a[i]) {
				count++;
			}
		}
		
		System.out.println("frequency of largest number :"+count);
		
		System.out.println("-----------OR-----------");

          List<Integer> list = Arrays.asList( 2, 3, 3, 4, 5, 5, 5, 6, 7 );
		Map<Object, Long> collect = list.stream().collect(Collectors.groupingBy(j -> j, TreeMap::new, Collectors.counting()));
		
		System.out.println(collect.entrySet().stream().skip(collect.size() - 1).findFirst().get().getValue().intValue());;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
