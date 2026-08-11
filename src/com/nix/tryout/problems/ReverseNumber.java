package com.nix.tryout.problems;

public class ReverseNumber {

	public static int reverseNum(Integer[] intArr) {

	        int num = 0;
	        int start = 1;
	        for(int i = 0; i <= intArr.length-1; ++i) {
	            num += intArr[i] * start;
	            System.out.println(num);
	            start *= 10;
	        }

	        return num;
	}

	public static int getNumsOneByOne(int num) {
		int res = 0;

		System.out.println(num % 100);

		return res;
	}

	public static void main(String[] args) {
		Integer[] intArr = {2,6,8};
		getNumsOneByOne(245);
		System.out.println(reverseNum(intArr));
	}
}
