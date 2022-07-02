package com.nt;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsDemo {

	public static void main(String[] args) {
		Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6);
		String[] cities = new String[] { "Pune", "Banglore", "Hyderabad" ,"Hyderabad"};
		List<String> city= Stream.of(cities).collect(Collectors.toList());
		
		Set<String> uniqueCity=Stream.of(cities).collect(Collectors.toSet());
		uniqueCity.forEach(System.out::println);
		
		Map<Integer,String> map=Stream.of(cities).collect(Collectors.toMap(String::length, String::toString));
//		Map<Object, Object> squares=Stream.of(numbers).map(num-> num).collect(Collectors.toMap(num->num, (num)->num*num));
		
		
		
	}

}
