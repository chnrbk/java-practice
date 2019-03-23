import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsInstanceOf;

public class MyComparator {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("Raja");
		e1.setDepartment("AML");
		e1.setSalary(150000);
		e1.setAge(45);

		Employee e2 = new Employee();
		e2.setId(1);
		e2.setName("Raja");
		e2.setDepartment("BAL");
		e2.setAge(20);
		e2.setSalary(150000);
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(e1);
		employeeList.add(e2);
		 Collections.sort(employeeList, new EmployeeComparator());
		 System.out.println(employeeList);
		 employeeList.stream().forEach(System.out::println);
		

	}

	private static class EmployeeComparator implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {

			if (!(o1 instanceof Employee) || !(o2 instanceof Employee)) {
				return -1;
			} else {
				Employee e1 = (Employee) o1;
				Employee e2 = (Employee) o2;

				if ((e1).getName().compareTo(e2.getName()) == 0) {
					if(e1.getAge()-e2.getAge()==0){
						return 0;

					}else if(e1.getAge()-e2.getAge()<0){
						return -1;
					}else return 1;
						
				} else if ((e1).getName().compareTo(e2.getName()) < 0) {
					return -11;
				} else if ((e1).getName().compareTo(e2.getName()) > 0) {
					return 1;
				}
			}
			return 0;
		}

	}
}
