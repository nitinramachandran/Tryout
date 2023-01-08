package com.nix.tryout.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Identify the biggest and smallest while adding elements to the list
 * @author nitinramachandran
 *
 */
public class SmartSearch implements Search{
	
	private List<Integer> intList;
	private Integer largest = null;
	private Integer smallest = null;

	@Override
	public void addElement(Integer intval) {
		
		if(intList == null || intList.isEmpty()) {
			largest = intval;
			smallest = intval;
		} 
		else if( intval > largest) {
			largest = intval;
		}
		else if(intval < smallest) {
			smallest = intval;
		}
		
		intList = new ArrayList<Integer>();
		intList.add(intval);
	}
	
	@Override
	public Integer getLargest() {
		return largest;
	}
	
	public Integer getSmallest() {
		return smallest;
	}
}