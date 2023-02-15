package com.nix.tryout.datastructure.collections;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student stud1, Student stud2) {
		return stud1.getLastName().compareTo(stud2.getLastName());
	}

}
