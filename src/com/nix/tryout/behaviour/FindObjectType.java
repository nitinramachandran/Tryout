package com.nix.tryout.behaviour;

public class FindObjectType {
	
	
	public String findType(Object obj) {
		return(obj.getClass().getSimpleName());
	}

	public static void main(String[] args) {
		
		FindObjectType ob = new FindObjectType();
		
		System.out.println("The given type of class is : " + ob.findType("123"));

	}

}
