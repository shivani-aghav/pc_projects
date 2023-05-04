package design_patterns.creational.abstract_factory;

public class AbstractFactoryProducer {

	public static AbstractFactory getTrainee(boolean isTrainee) {
		if (isTrainee) {
			return new TraineeProfessionAbstractFactory();
		}else {
			return new ProfessionAbstractFactory();
		}
	}
}
