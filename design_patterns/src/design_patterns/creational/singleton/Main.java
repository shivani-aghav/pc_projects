package design_patterns.creational.singleton;

public class Main {

	public static void main(String[] args) {
		EagerSingleton instance = EagerSingleton.getInstance();
		System.out.println(instance);//same instance will get
		EagerSingleton instance1 = EagerSingleton.getInstance();
		System.out.println(instance1);//same instance will get
		
		LazySingleton instance2 = LazySingleton.getInstance(); 
		System.out.println(instance2);
		LazySingleton instance3 = LazySingleton.getInstance(); 
		System.out.println(instance3);

	}
}
