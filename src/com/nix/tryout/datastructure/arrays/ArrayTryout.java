package com.nix.tryout.datastructure.arrays;

public class ArrayTryout {
	
	public int[] getCrazyArray(int[] arr) {
		arr[0] = 1;
		for(int i = 0; i < arr.length; ++i) {
			for(int j = i + 1; j < arr.length; ++j) {
			//	if((j+1) < arr.length) {
					arr[i] *= arr[j]; 
			//	}
			}
		}
		
		
		return arr;
	}

	public static void main(String[] args) {
		
		int[] array = {2, 3, 2, 4};
		
		ArrayTryout ar = new ArrayTryout();
		
		for(int val : ar.getCrazyArray(array)) {
			
			System.out.print(val + " ");
		}

	}

}
