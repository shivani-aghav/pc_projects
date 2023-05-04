package design_patterns.creational.abstract_factory;

public class ClientMain {

	public static void main(String[] args) {
		AbstractFactory fac = AbstractFactoryProducer.getTrainee(true);
		Profession prof = fac.getProfession("engineer");
		prof.prof();
	}
}
