package java_8.features;

public class MethodReferenceExample2 {
  
	public static void main(String[] args) {
//		Thread t = new Thread(()-> name());//executing method with no parameter
		Thread t1 = new Thread(MethodReferenceExample2::name);
		t1.start();
	}
	
	public static void name() {
		System.out.println("hello");
	}
}
