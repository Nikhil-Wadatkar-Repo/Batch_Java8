package com.nt;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		Employee emp = new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0);
		Function<Employee, String> function = (emp1) -> emp.getDepartment();
		System.out.println(function.apply(emp));
	}

}