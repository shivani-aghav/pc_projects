package arrayList;

public class Child extends Parent {

	public static void sup() {
		System.out.println("i am child");
	}

	public void supp() {
		System.out.println("i am NS child");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.sup();
		c.supp();
		System.out.println("------------------------");
		Parent p = new Parent();
		p.sup();
		p.supp();
		System.out.println("------------------------");
		Parent p1 = new Child();
		p1.sup();
		p1.supp();
		System.out.println("------------------------");
        Child c1=(Child) p1;
        c1.sup();
        c1.supp();
	}
}
