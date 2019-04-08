package com.nix.tryout.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaSortCoexn {

	public static void main(String[] args) {
		
		List<Person> persons= Arrays.asList(
			new Person("Nitin", "Ram", 37),
			new Person("Dam", "Raj", 30),
			new Person("Max", "Bat", 29),
			new Person("Darun", "Nat", 39),
			new Person("Dan", "Axe", 37)
				);
		Collections.sort(persons, (p1, p2) -> p1.getLastname().compareToIgnoreCase(p2.getLastname()));
		
		System.out.println("Printing every persons");
		printConditionally(persons , p -> true, p -> System.out.println(p));
		
		System.out.println("Printing every persons with Lastname beginning with D");
		printConditionally(persons, p -> p.getFirstname().startsWith("D"), p -> System.out.println(p.getFirstname()));
		
		System.out.println("Printing every persons with age more than 30");
		
		printConditionally(persons, p -> p.getAge() >= 30, p -> System.out.println(p.getAge()));
	}
	
	private static void printConditionally(List<Person> persons, Predicate<Person> condition, Consumer<Person> consumer) {
		for(Person p : persons) {
			if(condition.test(p)) {
				consumer.accept(p);
			}
		}
	}
}

