package com.nix.tryout.java8.lambda;

public class TypeInferenceExample {

	public static void main(String[] args) {
		StringLengthLambda lambda = (s, val) -> s.length() * val;
		System.out.println(lambda.getLength("Hello Lambda", 2));

		
	}

}

interface StringLengthLambda {
	
	int getLength(String s, int value);
}