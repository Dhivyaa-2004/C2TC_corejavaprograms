package com.tnsif.Day6.staticvariable;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Employee.companyName);
		Employee e = new Employee("Arun", 123);
		System.out.println(e);
		
		// Similarly, create the second object of the class and pass the two arguments.
		e = new Employee("Nithya", 321);
		System.out.println(e);

	}

}
