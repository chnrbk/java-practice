package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import nag.practice.Person;

public class ConvertSetToArraysAndList {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(4);
		Integer[] a = new Integer[set.size()];
		set.toArray(a);
		
		System.out.println("Set to Array "+ Arrays.toString(a));
		Set<Integer> s  =convertArrayToSet(a);
		System.out.println("Array to Set "+s);
		
		//convert each element of list as String

		String joined = s.stream().map(Object::toString).collect(Collectors.joining(", "));
		int sum = s.stream().collect(Collectors.summingInt(Integer::valueOf));
		System.out.println(sum);
		
		 List<Employee> employees = new ArrayList<>();
		 employees.add(new Employee("Nag","Dep1",1200));
		 employees.add(new Employee("Raj","Dep2",1300));
		 employees.add(new Employee("Bag","Dep1",1400));
		 
		Map<String, Integer> totalByDept  = employees .stream()
                    .collect(Collectors.groupingBy(Employee::getDepartment,
                                                   Collectors.summingInt(Employee::getSalary)));

		System.out.println(totalByDept);

		/*//Implementations of Collector that implement various useful reductionoperations, such as accumulating elements into collections, summarizingelements according to various criteria, etc. 

	//	The following are examples of using the predefined collectors to performcommon mutable reduction tasks: 
		// Accumulate names into a List
		     Collection<Integer> people;
			List<String> list = people.stream().map(Person::getName).collect(Collectors.toList());

		     // Accumulate names into a TreeSet
		     Set<String> set = people.stream().map(Person::getName).collect(Collectors.toCollection(TreeSet::new));

		     // Convert elements to strings and concatenate them, separated by commas
		     String joined = things.stream()
		                           .map(Object::toString)
		                           .collect(Collectors.joining(", "));

		     // Compute sum of salaries of employee
		     int total = employees.stream()
		                          .collect(Collectors.summingInt(Employee::getSalary)));

		     // Group employees by department
		     Map<Department, List<Employee>> byDept
		         = employees.stream()
		                    .collect(Collectors.groupingBy(Employee::getDepartment));

		     // Compute sum of salaries by department
		     Map<Department, Integer> totalByDept
		         = employees.stream()
		                    .collect(Collectors.groupingBy(Employee::getDepartment,
		                                                   Collectors.summingInt(Employee::getSalary)));

		     // Partition students into passing and failing
		     Map<Boolean, List<Student>> passingFailing =
		         students.stream()
		                 .collect(Collectors.partitioningBy(s -> s.getGrade() >= PASS_THRESHOLD));
		Since:1.8*/
	}

	private static Set<Integer> convertArrayToSet(Integer[] a) {
		
		return Arrays.asList(a).stream().collect(Collectors.toSet());
	}
	

}
