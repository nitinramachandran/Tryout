package com.nix.tryout.java8.lambda;

public class Person {
	
	private String firstname;
	private String lastname;
	private int age;

	public Person(String fname, String lname, int age) {
		
		this.firstname = fname;
		this.lastname = lname;
		this.age  = age;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return firstname + " " + lastname + " - " + age;
	}

}
