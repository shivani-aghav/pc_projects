package design_patterns.creational.abstract_factory;

public class ProfessionAbstractFactory extends AbstractFactory {

	@Override
	Profession getProfession(String profession) {
		
		if (profession == null) {
			return null;
		} else if (profession.equalsIgnoreCase("Engineer")) {
			return new Engineer();
		} else if (profession.equalsIgnoreCase("teacher")) {
			return new Teacher();
		}
		return null;
	}

}
