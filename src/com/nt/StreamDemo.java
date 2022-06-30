
package com.nt;

import java.util.LinkedList;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		//Stream.of
		Stream<Integer> numbers = Stream.of(1,2,3,4,5,6);
		numbers.forEach(System.out::println);
		
		//stream from array
		String[] cities = new String[] {"Pune","Banglore","Hyderabad"};
		Stream.of(cities).forEach(System.out::println);
		
		//stream form list collection
		LinkedList<Integer> nums=new LinkedList();
		nums.add(54);
		nums.add(98);
		
		nums.stream().forEach(System.out::println);
		
		//generate method
		Stream<Integer> rollNumbers=Stream.generate(()->new Random().nextInt());
		rollNumbers.limit(20).forEach(System.out::println);
		
		System.out.println("---------------");
		//stream for chars of string
		IntStream stream = "12345_abcdefg".chars();
		stream.forEach(p -> System.out.println(p));

		//OR

		Stream<String> streams = Stream.of("A$B$C".split("\\$"));
		streams.forEach(p -> System.out.println(p));
		
		
		
	}

}
