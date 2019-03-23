package nag.practice;

import java.util.Arrays;
import java.util.List;

/**
 * @author Benjamin Winterberg
 */
public class Person {
	private String name;
	private Integer Salary;
	private Integer age;

	public Person(String name, Integer age) {
		this.age=age;
		this.name=name;
	}

	public static void main(String[] args) {
		System.out.println("In main method");
		List<Integer> values = Arrays.asList(3, 5, 8, 9, 12);

		int sum = values.stream().reduce(0, (i1, i2) -> i1 + i2);

		System.out.println(sum);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return Salary;
	}

	public void setSalary(Integer salary) {
		Salary = salary;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
	
}