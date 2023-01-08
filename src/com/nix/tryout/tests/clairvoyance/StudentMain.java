package com.nix.tryout.tests.clairvoyance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentMain {
	
	private Map<String, Student> studentMap = new HashMap<String, Student>();

	public static void main(String[] args) {
		
		Student stud1 = new Student("John", "Doe");
		Student stud2 = new Student("John", "Lincoln");
		Student stud3 = new Student("Amy", "Doe");
		Student stud4 = new Student("Foo", "Bar");
		Student stud5 = new Student("Ram", "Nix");
		Student stud6 = new Student("Nix", "Doe");
		
		StudentMain distnictStudents = new StudentMain();
		
		distnictStudents.addDistinctStudents(stud1);
		distnictStudents.addDistinctStudents(stud2);
		distnictStudents.addDistinctStudents(stud3);
		distnictStudents.addDistinctStudents(stud4);
		distnictStudents.addDistinctStudents(stud5);
		distnictStudents.addDistinctStudents(stud6);
		
		System.out.println(distnictStudents.getDistinctListOfStudents());
		
	}
	
	public void addDistinctStudents(Student student) {
		studentMap.put(student.getLastName(), student);
	}
	
	public List<Student> getDistinctListOfStudents() {
		
		return new ArrayList<Student> (studentMap.values());
	}

}
