package com.nix.tryout.algorithms.devideandconquer;

public class SearchBiggest {
	
	public static boolean exists(int[] ints, int k) {
		
		boolean isThere = false;

		if(ints.length > 0) {
			
			isThere = divideAndConquer(ints, 0, ints.length-1, k);
		}
		return isThere;
	}
	
	private static boolean divideAndConquer(int[] ints, int start, int end, int k) {
		
		int mid = (start + end) / 2;
		System.out.println("Start : " + start + "| End: "+ end +"| Mid : " + mid + "| ints[mid] : " + ints[mid]+"| K: "+k);

		
		if(ints[mid] == k) {
			return true;
		}
		else if(start >= end ) {
			return false;
		}
		else if(ints[mid] > k ) {
			return divideAndConquer(ints, start, mid-1 , k);
		}
		else {
			return divideAndConquer(ints, mid+1, end, k);
		}
	}
	

	public static void main(String[] args) {
		
		int[] arr1 = new int[] {-9, 14, 15, 32, 37, 102};
		
			System.out.println(SearchBiggest.exists(arr1, 31));
	}
}