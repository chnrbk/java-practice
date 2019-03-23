package general;

public class Employee {
	String name;
	String department;
	Integer Salary;

	public Employee(String name, String department, Integer salary) {
		super();
		this.name = name;
		this.department = department;
		Salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getSalary() {
		return Salary;
	}

	public void setSalary(Integer salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", Salary=" + Salary + "]";
	}
	

}
