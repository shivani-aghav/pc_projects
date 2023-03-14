package string_concepts.mystring1;

public class A {
	static int m;

	 double n;

	public A(int i) {
		m = i;
		System.err.println("A1 int");
	}

	public A(double d) {
		n = d;
		System.err.println("A double");
	}

	{
		System.out.println(m);
		System.out.println(n);
	}

	public static void main(String[] args) {
		A a1 = new A(500);

		A a2 = new A(50.0);

		System.out.println(a1.m + " : " + a1.n);

		System.out.println(a2.m + " : " + a2.n);
	}
}