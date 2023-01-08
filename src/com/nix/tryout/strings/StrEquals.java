package com.nix.tryout.strings;

public class StrEquals extends Thread{
	
	public static void foooo() {
		
	}
	
	private final String foo = "dfdf";

	public static void main(String[] args) {
		
		String s1 = "Abc";
		String s2 = "Abc";
		String s3 = new String("Abc");
		String s4 = new String("Abc");
		System.out.println(s1 == s2);
		System.out.println(s4 == s3);
		
		StrEquals aa = new StrEquals();
		 // StrEquals bb = (StrEquals)aa.clone();
		
	//	System.out.println(bb);
		int ii = Integer.MAX_VALUE + 10;
		
		System.out.println(ii);
	}

	
	public String toString() {
		return foo;
	}
}
