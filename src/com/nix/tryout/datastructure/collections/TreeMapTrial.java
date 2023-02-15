package com.nix.tryout.datastructure.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTrial {

	public static void main(String[] args) {
		
		Map<String, Integer> treeMap = new TreeMap<String, Integer>();
		
		treeMap.put("Zbc", 1);
		treeMap.put("abc", 2);
		treeMap.put("Abc", 3);
		treeMap.put("Dbc", 4);
		
		System.out.println(treeMap);

	}

}
