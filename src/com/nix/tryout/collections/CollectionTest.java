package com.nix.tryout.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionTest {

	public static void main(String[] args) {

		CollectionPacker packer = new CollectionPacker();
		
		Set<Student> hashSet = new HashSet<Student>();
		packer.getStudents(hashSet);
		System.out.println("Hashset : " + hashSet);
		
		List<Student> aList = new ArrayList<Student>();
		packer.getStudents(aList);
		System.out.println("ArrayList : " + aList);
		
		Set<Student> treeSet = new TreeSet<Student>();
		packer.getStudents(treeSet);
		System.out.println("TreeSet : " + treeSet);
		
		// Experiment Applying Comparator to Treeset
		
//		StudentComparator studCompare = new StudentComparator();
// The below won't work
//		Collections.sort(treeSet, studCompare);
		AddressComparator addrCompare = new AddressComparator();
		Set<Address> treeSet2 = new TreeSet<Address>(addrCompare);
		Address addr1 = new Address();
		Address addr2 = new Address();
		Address addr3 = new Address();
		Address addr4 = new Address();
		
		addr1.setCountry("India");
		addr2.setCountry("China");
		addr3.setCountry("UK");
		addr4.setCountry("Mexico");
		
		treeSet2.add(addr1);
		treeSet2.add(addr2);
		treeSet2.add(addr3);
		treeSet2.add(addr4);
	//	Collections.sort(treeSet2, addrCompare);
		System.out.println("TreeSet 2 : " + treeSet2);
		
		
	}
}