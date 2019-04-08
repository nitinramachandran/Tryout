package com.nix.tryout.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generics {

	/**
	 * Takes a list of any super class of Animal
	 * @param aniList
	 */
	public void meth01(List<? super Animal> aniList) {
	}
	
	/**
	 * Takes as parameter any list of type subclalss of Animal
	 * @param aniList
	 */
	public void meth02(List<? extends Animal> aniList) {		
	}

	public static void main(String[] args) {

		Generics gen = new Generics();
		
		List<Dog> dList = new ArrayList<Dog>();
		
		List<String> strList = new ArrayList<String>();
		dList.add(new Pug());
		
		List<LivingThing> livList = new ArrayList<LivingThing>();
		
		livList.add(new Dog());
		livList.add(new Cat());
		
		
		gen.meth02(dList);
		gen.meth01(livList);
		
		List<? super Animal> dList2 = new ArrayList<LivingThing>();
		
	}
}