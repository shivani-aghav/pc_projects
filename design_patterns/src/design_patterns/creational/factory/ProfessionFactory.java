package design_patterns.creational.factory;

public class ProfessionFactory {

	public Profession getProfession(String st) {
		
		if (st==null) {
			return null;
		}else if (st.equalsIgnoreCase("doctor")) {
			return new Doctor();
		}else if (st.equalsIgnoreCase("Engineer")) {
			return new Engineer();
		}else if (st.equalsIgnoreCase("teacher")) {
			return new Teacher();
		}
		return null; 
	}
}
