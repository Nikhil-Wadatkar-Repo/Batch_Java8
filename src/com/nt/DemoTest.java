package com.nt;

import java.util.function.Predicate;

public class DemoTest implements GetInformation {

	public static void main(String[] args) {

		Employee emp = new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0);
//		check if Employee has salary greater than 2000
		Predicate<Employee> p1 = (emp1) -> emp1.getSalary() > 1;
		System.out.println(p1.test(emp));

//		check if Employee is male or female
		Predicate<Employee> p2 = (emp1) -> emp1.getGender().equalsIgnoreCase("Female");
		System.out.println(p2.test(emp));
//		checking two conditions
		Predicate<Employee> and2 = p1.and(p2);
		System.out.println(and2.test(emp));

		Predicate<Employee> emp2= employee-> employee.getAge()>32;
		
		Predicate<Employee> or = emp2.or(p2);
		System.out.println(or.test(emp));
	}

	@Override
	public String showName() {
		return "Ankur";
	}

	@Override
	public String showSurname() {
//		return GetInformation.super.showSurname();
		return "subclass method";
	}

}