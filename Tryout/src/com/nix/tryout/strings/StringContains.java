package com.nix.tryout.strings;

import java.util.ArrayList;
import java.util.List;

public class StringContains {

	
	public static void main(String[] args) {
		List<String> aList = new ArrayList<String>();
		aList.add("nitinisadeveloperinjava");
		aList.add("akhilisaqawithcodingknowledgeinjava");
		
		for(String st : aList) {
			System.out.println(st+" : "+st.contains("java"));
		}
	}

}
