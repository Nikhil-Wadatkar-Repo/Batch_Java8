package com.nt;

import java.util.function.Function;

public class LambdaExAsMethodArgument {
	public static void main(String[] args) {
		m1((str)->str.toUpperCase(),"ankur");
	}
	
	
	public static void m1(Function<String, String> myFunction,String ss) {
		System.out.println(myFunction.apply(ss));
		
	}

}
