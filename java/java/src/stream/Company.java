package stream;

public class Company {

	private String empName;
	private int id;
	private String dept;

	
	public Company(String empName, int id, String dept) {
		super();
		this.empName = empName;
		this.id = id;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Company [empName=" + empName + ", id=" + id + ", dept=" + dept + "]";
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

}
