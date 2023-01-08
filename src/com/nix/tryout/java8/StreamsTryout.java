package com.nix.tryout.java8;

/**
 * 
 * @author nitinramachandran
 *
 */
public class StreamsTryout {

	public static void main(String[] args) {
		
		SampleToString toStr = new SampleToString();
		System.out.println(toStr);
	}
}

class SampleToString {
	SampleToString() {
		System.out.println("SampleToString class.!!");
	}

//	@Override
	public String toString() {
		return "Ranjith";
	}
}