package com.nix.tryout.java8.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaStreams {

public static void main(String[] args) {
		
		List<Person> persons= Arrays.asList(
			new Person("Nitin", "Ram", 37),
			new Person("Dam", "Raj", 30),
			new Person("Max", "Bat", 29),
			new Person("Darun", "Nat", 39),
			new Person("Dan", "Axe", 37)
				);

		persons.stream()
			.filter(p -> p.getAge() >=30)
			.forEach(p -> System.out.println(p.getFirstname()));
	}
}