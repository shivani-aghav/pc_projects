package javaa;

public class StaticDemo {


	public StaticDemo() {
		this(true);
		System.out.println("Static()");
	}

	public StaticDemo(boolean b) {
		this(10);
		System.out.println("Static(boolean b)");
	}
	public StaticDemo(int b) {
		System.out.println("Static(int b)");
	}

	public static void main(String[] args) {
		StaticDemo staticDemo = new StaticDemo();
	}
}
