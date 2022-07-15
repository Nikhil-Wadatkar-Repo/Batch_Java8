package com.nt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperationsDemo {

	public static void main(String[] args) {
		List<EmployeeDetails> employees = EmployeeDetails.getEmployees();
		List<String> names = Arrays.asList("ankur", "dhanashri", "mandavi", "nana", "ashu tayo", "prachi", "gaurav");
		List<Integer> number=Arrays.asList(12,25,65,98,86,56,88,46,86,65,99);

		names.stream().limit(2).forEach(System.out::println);
		System.out.println("===============");
		names.stream().skip(2).forEach(System.out::println);
		System.out.println("===============");
		names.stream().sorted().forEach(System.out::println);
		System.out.println("========Reduce=========");
		//reduce function with accumulator
		System.out.println("Sum: "+number.stream().reduce((x,y)->x+y).get());
		//reducer with identity and accumulator
		System.out.println("Sum: "+number.stream().reduce(10,(x,y)->x+y));
		//reducer with identity , accumulator, combiner
		

	}

}
