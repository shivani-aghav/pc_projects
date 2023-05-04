package javaa;

import java.util.function.Predicate;

public class TestPredicate {

	public static void main(String[] args) {
		
	int a[]= {1,2,3,4,5,6};
	Predicate<Integer> p1=i->i%2==0;
	Predicate<Integer> p2=i->i>2;
	
	System.out.println("print all even no:");
	
	m1(p1.and(p2), a);
	System.out.println();
	m1(p1.or(p2), a);
	System.out.println();
	m1(p1.negate(), a);
	}
	public static void m1(Predicate<Integer>  p,int []a) {
		for (int i : a) {
			if (p.test(i)) {
				System.out.println(i);
			}
		}
	}
}
