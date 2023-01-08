package com.nix.tryout.algorithms.recursion;

/**
 * Calculates Fibonacci series using recursion
 * @author nitinramachandran
 *
 */
public class Fibonacci {
	
	public void printFibonacciSeries(int lastNumber) {

		int firstNo = 0;
		int secondNo = 1;
		int iter = 2;
		
		System.out.println("F(0) : " + firstNo);
		System.out.println("F(1) : " + secondNo);
		
		calcFiboRecursively(firstNo, secondNo, iter, lastNumber);
	}
	
	/**
	 * Recursively calls to print the Fibonacci series until the last number has reached
	 * @param previousNo
	 * @param currentNo
	 * @param iteration
	 * @param lastNo
	 */
	private void calcFiboRecursively(long previousNo, long currentNo, int iteration, int lastNo) {
		
		if(iteration <= lastNo) {
			long result = previousNo + currentNo;
			System.out.println("F("+iteration+") : " + result);
			
			calcFiboRecursively(currentNo, result, ++iteration, lastNo);
		}
	}

	public static void main(String[] args) {
		
		Fibonacci fibo = new Fibonacci();
		fibo.printFibonacciSeries(50);
	}

}
