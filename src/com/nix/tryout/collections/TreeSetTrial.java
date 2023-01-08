package com.nix.tryout.collections;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTrial {

	public static void main(String[] args) {
		
		Set<String> tree = new TreeSet<String>();
		
		tree.add("Zya");
		tree.add("AsC");
		tree.add("ASc");
		
		System.out.println(tree);

		NavigableSet<Integer> intSet = new TreeSet<Integer>();
		intSet.add(1);
		intSet.add(2);
		intSet.add(3);
		intSet.add(4);
		intSet.add(5);
		intSet.add(6);
		intSet.add(7);
		
		System.out.println(intSet.ceiling(5));
	}
}