package stream;


public class Employee {

	private String name;
	private String job;
	private Integer salary;
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(String name, String job, Integer pincode,Integer id) {
		super();
		this.name = name;
		this.job = job;
		this.salary = pincode;
		this.id=id;
	}

	

	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", job=" + job + ", salary=" + salary + ", id=" + id + "]";
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer pincode) {
		this.salary = pincode;
	}

	
	
	
}
