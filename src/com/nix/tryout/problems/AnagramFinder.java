package com.nix.tryout.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramFinder {

	public static void main(String[] args) {

		String str = "NitinRamachandran";

		char[] strArr = str.toCharArray();
		Arrays.parallelSort(strArr);
		System.out.println(new String(strArr).toLowerCase());
		List<String> words = new ArrayList();
		words.add("cat");
		words.add("tac");
		words.add("bat");
		words.add("tab");
		words.add("some");

	}


	public List[] getAnagrams(List<String> words) {

		for(String word : words) {


		}


		return null;
	}

}
