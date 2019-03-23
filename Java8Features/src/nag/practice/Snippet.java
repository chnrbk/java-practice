package nag.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Snippet {
	public static void main(String[] args) {
	List<Employee> employeeList = Arrays.asList(new Employee("name1",3990000.0),new Employee("name2", 50000.0d),new Employee("name3",30000.0),new Employee("name4", 1000.0d));
	Optional<Employee> maxSalaryEmp=employeeList.stream()
	    .reduce((Employee a, Employee b) -> a.getSalary() < b.getSalary() ? b:a);
	if(maxSalaryEmp.isPresent())
	  System.out.println("Employee with max salary: "+maxSalaryEmp.get().getName());
	}
}

class Employee{
	private String name;
	private Double salary;
	public Employee(String name, double salary) {
		this.name=name;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
}