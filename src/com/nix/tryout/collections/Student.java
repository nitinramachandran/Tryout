package com.nix.tryout.collections;

import java.util.Date;

public class Student implements Comparable<Student>{

	private Integer id;
	
	private String firstName;
	
	private String lastName;
	
	private Date dateOfBirth;
	
	private Address address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public int compareTo(Student o) {
		
		return this.firstName.compareTo(o.firstName);
	}
	
	@Override
	public String toString() {
		return this.firstName + " " + this.lastName;
	}
}