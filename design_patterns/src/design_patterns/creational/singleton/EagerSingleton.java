package design_patterns.creational.singleton;

public class EagerSingleton {

	private static EagerSingleton instance=new EagerSingleton();

	private EagerSingleton() {}//private const so obj creation is restricted
	
	public static EagerSingleton getInstance() {
		return instance;
	}
	
}
