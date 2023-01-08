package com.nix.tryout.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {

		List<Student> alist = new ArrayList<Student>();
		
		Student stud1 = new Student();
		Student stud2 = new Student();
		Student stud3 = new Student();
		Student stud4 = new Student();
		
		stud1.setFirstName("ram");
		stud2.setFirstName("sreeju");
		stud3.setFirstName("bitu");
		stud4.setFirstName("chinju");
		
		stud1.setLastName("babu");
		stud2.setLastName("hari");
		stud3.setLastName("nandan");
		stud4.setLastName("mankave");
		
		alist.add(stud1);
		alist.add(stud2);
		alist.add(stud3);
		alist.add(stud4);
		
		System.out.println("Before Sorting : " + alist);
		
		Collections.sort(alist);
		
		System.out.println("After sorting using Comparable: " + alist);
		
		StudentComparator studCompare = new StudentComparator();
		Collections.sort(alist, studCompare);
		
		System.out.println("After sorting using Comparator : " + alist);
	}
}