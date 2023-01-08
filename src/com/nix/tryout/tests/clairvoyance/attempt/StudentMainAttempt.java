package com.nix.tryout.tests.clairvoyance.attempt;

import java.util.HashSet;
import java.util.Set;

public class StudentMainAttempt {
	
	private Set<Student_ObjBehaviorChanged> studentSet = new HashSet<Student_ObjBehaviorChanged>();

	public static void main(String[] args) {
		
		Student_ObjBehaviorChanged stud1 = new Student_ObjBehaviorChanged("John", "Doe");
		Student_ObjBehaviorChanged stud2 = new Student_ObjBehaviorChanged("John", "Lincoln");
		Student_ObjBehaviorChanged stud3 = new Student_ObjBehaviorChanged("Amy", "Doe");
		Student_ObjBehaviorChanged stud4 = new Student_ObjBehaviorChanged("Foo", "Bar");
		Student_ObjBehaviorChanged stud5 = new Student_ObjBehaviorChanged("Ram", "Nix");
		Student_ObjBehaviorChanged stud6 = new Student_ObjBehaviorChanged("Nix", "Doe");
		
		StudentMainAttempt distnictStudents = new StudentMainAttempt();
		
		distnictStudents.addToSet(stud1);
		distnictStudents.addToSet(stud2);
		distnictStudents.addToSet(stud3);
		distnictStudents.addToSet(stud4);
		distnictStudents.addToSet(stud5);
		distnictStudents.addToSet(stud6);
		
		System.out.println(distnictStudents.getSetOfStudents());
		
	}
	
	public void addToSet(Student_ObjBehaviorChanged student) {
		studentSet.add(student);
	}
	
	public Set<Student_ObjBehaviorChanged> getSetOfStudents() {
		return this.studentSet;
	}

}
