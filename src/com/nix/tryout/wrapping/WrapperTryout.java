package com.nix.tryout.wrapping;

public class WrapperTryout {

	public void meth01(Number nos) {
		System.out.println("Number");
	}
	
	public void meth01(Object nos) {
		System.out.println("Object");
	}
	
	public static void main(String[] args) {
		
		WrapperTryout wt = new WrapperTryout();
		
		wt.meth01(10);
		

	}

}
