package com.nix.tryout.tests.clairvoyance;

/**
 * There is a collection of 20 Student objects (class given below). You are
 * supposed to write a method to return Student objects with distinct last
 * names. E.g If Students are John Doe, John Lincoln, Amy Doe, Foo Bar => then
 * output should return Student objects for John Doe, John Lincoln, Foo Bar. You
 * are allowed to change the Student Class.
 * 
 * @author nitinramachandran
 *
 */
public class Student {

	private String firstName;

	private String lastName;
	
	public Student(String firstname, String lastname) {
		this.firstName = firstname;
		this.lastName = lastname;
	}
	
	public Student() {}

	public String getFirstName() {
	        return firstName;
	    }

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
}
