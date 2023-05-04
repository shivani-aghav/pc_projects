package basicprograms;

public class Child extends Parent{
 public void name() {
	System.out.println("child");
}
 public static void main(String[] args) {
	Child child = new Child();
	child.name();
	Parent p=child;
}
}
