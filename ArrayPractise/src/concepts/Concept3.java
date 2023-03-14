package concepts;

public class Concept3 {

	public static void main(String[] args) {
		D[] a = {new D()};

		System.out.println(a[0].i);

		System.out.println(a[0].j);

		System.out.println(a[0].k);

		System.out.println(a[0].m);
	}
}

class A {
	int i = 10;
}

class B extends A {
	int j = 20;
}

class C extends B {
	int k = 30;
}

class D extends C {
	int m = 40;
}
