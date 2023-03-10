package java_8.features;

public class MethodReferenceExample1 {
  
	public static void main(String[] args) {
//		Thread t = new Thread(()-> name());//executing method with no parameter
		Thread t1 = new Thread(MethodReferenceExample1::name);
		t1.start();
	}
	
	public static void name() {
		System.out.println("hello");
	}
}
