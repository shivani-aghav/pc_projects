package basicprograms.revision;

import java.util.List;

public class Employee {

	private int id;
	private String name;
	private long salary;
	private String gendre;
	private List<String> movies;
	private String department;

	public Employee(int id, String name, long salary, String gendre, List<String> movies, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.gendre = gendre;
		this.movies = movies;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", gendre=" + gendre + ", movies="
				+ movies + ", department=" + department + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getGendre() {
		return gendre;
	}

	public void setGendre(String gendre) {
		this.gendre = gendre;
	}

	public List<String> getMovies() {
		return movies;
	}

	public void setMovies(List<String> movies) {
		this.movies = movies;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
