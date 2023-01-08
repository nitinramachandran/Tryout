package com.nix.tryout.generics;

import java.util.ArrayList;
import java.util.List;

public class CreateAnArrayList {
	
	public <Y> CreateAnArrayList(Y y) {
		
	}
	
	public <T> void makeArrayList(T t) {
		
		List<T> list = new ArrayList<T>();
		list.add(t);
	}

	public <T> Object getInstance(T t) {
		return null;
	}
	public static void main(String[] args) {
		
		Dog d = new Dog();
		CreateAnArrayList cr = new CreateAnArrayList(d);
	}

}
