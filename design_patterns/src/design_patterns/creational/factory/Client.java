package design_patterns.creational.factory;

public class Client {

	public static void main(String[] args) {
		ProfessionFactory pf = new ProfessionFactory();
		Profession profession = pf.getProfession("doctor");
		Profession profession1 = pf.getProfession("teacher");
		profession.prof();
		profession1.prof();
	}
	
}
