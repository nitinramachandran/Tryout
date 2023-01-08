package com.nix.tryout.tests;

import java.util.Arrays;

/**
 * Given an Integer N returns the smallest number with the same no of digits
 * N = 125, ans = 100
 * @author nitinramachandran
 *
 */
public class TestOne {
	public int solution(int N) {
		
		int result = 0;
		int numLen = ("" + N).toCharArray().length;
		char[] intArr = new char[numLen];
		
		if(numLen > 1) {

			intArr[0] = '1';
			Arrays.fill(intArr, 1, numLen, '0');
			
			result = Integer.parseInt(new String(intArr));
		}
		return result;
	}
	
	

	public static void main(String[] args) {
		
		TestOne t = new TestOne();
		
		System.out.println("1000000101 : " + t.solution(1000000101));
		System.out.println("0 : " + t.solution(0));
		System.out.println("1 : " + t.solution(1));
		System.out.println("4859454 : " + t.solution(4859454));
		System.out.println("999999999 : " + t.solution(999999999));
		System.out.println("48374800 : " + t.solution(48374800));
		System.out.println("00000000001 : " + t.solution(00000000001));

	}

}
