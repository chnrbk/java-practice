class Employee {
	
	private int id;
	private String name;
	private String department;
	private int age;
	private double salary;
	
		
		private void method1(){
			System.out.println("m1");
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


		public String getDepartment() {
			return department;
		}


		public void setDepartment(String department) {
			this.department = department;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		public double getSalary() {
			return salary;
		}


		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		@Override
		public String toString() {
			return getDepartment()+"-"
					+getName()+"-"
					+getAge();
		}
		
	}