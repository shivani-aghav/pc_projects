package basicprograms;

import java.util.List;

public class Employee {

	private String name;
	private String motherName;
	private String fatherName;
	private List<String> sons;

	public Employee(String name, String motherName, String fatherName, List<String> sons) {
		super();
		this.name = name;
		this.motherName = motherName;
		this.fatherName = fatherName;
		this.sons = sons;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public List<String> getSons() {
		return sons;
	}

	public void setSons(List<String> sons) {
		this.sons = sons;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", motherName=" + motherName + ", fatherName=" + fatherName + ", sons=" + sons
				+ "]";
	}
	
	

}
