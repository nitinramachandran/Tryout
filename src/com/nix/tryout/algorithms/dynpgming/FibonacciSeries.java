package com.nix.tryout.algorithms.dynpgming;

public class FibonacciSeries {

	static int count;
	int[] memo = new int[15];

	int fib(int n) {

		if(memo[n] != 0) {
			return memo[n];
		}
		count++;
		if(n < 0) {
			System.out.println("Error Value.!!");
			return -1;
		} else if(n ==0) {
			return 0;
		} else if(n == 1) {
			return 1;
		}
		int sum = fib(n-1) + fib(n-2);
		memo[n] = sum;
		return sum;

	}

	public static void main(String[] arg) {
		FibonacciSeries fs = new FibonacciSeries();
		System.out.println(fs.fib(14));
		System.out.println("Count : " + FibonacciSeries.count);
	}
}

// 0 1 1 2 3 5 8
