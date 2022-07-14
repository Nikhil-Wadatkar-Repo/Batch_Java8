package com.nt;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsDemo {

	public static void main(String[] args) {
		Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6);
		String[] cities = new String[] { "Pune", "Banglore", "Hyderabad", "Lahore" };
		List<String> city = Stream.of(cities).collect(Collectors.toList());

		// collect method list
		List<String> upperCities = Stream.of(cities).collect(Collectors.toList());
		System.out.println("Upper cities" + upperCities);
		// collect method set
		Set<String> uniqueCities = Stream.of(cities).collect(Collectors.toSet());
		System.out.println("Unique cities:" + uniqueCities);

		// collect method map
		Map<Integer, String> mapCities = Stream.of(cities).collect(Collectors.toMap(String::length, str -> str));
		System.out.println("Map cities" + mapCities);

		String[] strings = Stream.of(cities).toArray(String[]::new);
		for (String string : strings) {
			System.out.println(string);
		}
		System.out.println();

		// joining
		String allCities = Stream.of(cities).collect(Collectors.joining(" , "));
		System.out.println("allCities:" + allCities);

		// counting
		Long noOfCities = Stream.of(cities).collect(Collectors.counting());
		System.out.println("NoOf Cities:" + noOfCities);

		// max and min
		Optional<String> maxCityLength = Stream.of(cities)
				.collect(Collectors.maxBy(Comparator.comparing(String::length)));
		System.out.println("Max city length: " + maxCityLength.get());

		Optional<String> minCity = Stream.of(cities).collect(Collectors.minBy(Comparator.comparing(String::toString)));
		System.out.println("Min city: " + minCity.get());

		Integer sumOfNumbers = numbers.collect(Collectors.summingInt(Integer::valueOf));
		System.out.println("Sum :" + sumOfNumbers);

		// summerizing => count,max,min,average,sum
		IntSummaryStatistics sum = numbers.collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println(sum.getAverage());
		System.out.println(sum.getCount());
		System.out.println(sum.getMax());
		System.out.println(sum.getMin());
		System.out.println(sum.getSum());
		String[] cities1 = new String[] { "Pune", "Banglore", "Hyderabad" ,"Hyderabad"};
		List<String> city1= Stream.of(cities).collect(Collectors.toList());
		
		Set<String> uniqueCity1=Stream.of(cities1).collect(Collectors.toSet());
		uniqueCity1.forEach(System.out::println);
		
		Map<Integer,String> map=Stream.of(cities).collect(Collectors.toMap(String::length, String::toString));
//		Map<Object, Object> squares=Stream.of(numbers).map(num-> num).collect(Collectors.toMap(num->num, (num)->num*num));
		
		
		
	}

}

//Collecting the stream elements (which are filtered/processed) into various kinds for formats like collection or array
//Joining or counting
//Finding max or min
//Doing sum of any thing
//Grouping or portioning 
//Finding average for any int, long, double kind of property
//Summarizing for any int, long, double kind of property
