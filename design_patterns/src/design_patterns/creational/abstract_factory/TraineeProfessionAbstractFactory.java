package design_patterns.creational.abstract_factory;

public class TraineeProfessionAbstractFactory extends AbstractFactory{

	@Override
	Profession getProfession(String profession) {
		if (profession == null) {
			return null;
		} else if (profession.equalsIgnoreCase("Engineer")) {
			return new TraineeEngineer();
		} else if (profession.equalsIgnoreCase("teacher")) {
			return new TraineeTeacher();
		}
		return null; 	
	}

}
