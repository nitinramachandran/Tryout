package com.nix.tryout.datastructure.collections;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch implements Search{
	
	List<Integer> intlst;
	
	@Override
	public Integer getLargest() {

		Integer biggest =  null;
		
		if(intlst.size() > 0) {
		
			for(int i = 0; i < intlst.size(); ++i) {
				
				if(i == 0) {
					biggest = intlst.get(i);
					continue;
				}
				if(intlst.get(i) > biggest) {
					biggest = intlst.get(i);
				}
			}
		}
		return biggest;
	}
	
	public void addElement(Integer intval) {
		intlst = new ArrayList<Integer>();
		intlst.add(intval);
	}
}