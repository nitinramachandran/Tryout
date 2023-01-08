package com.nix.tryout.optional;

import java.util.Optional;
public class OptionalTryout {
	

	public Optional<String> getVal(String val) {
		if(val.equals("aaa")) {
			return Optional.ofNullable("good");
		}
		return Optional.empty();
	}

	public static void main(String[] args) {
		
		OptionalTryout op = new OptionalTryout();
		
		Optional<String> opStr = op.getVal("aaa");
		
		System.out.println("1st Time : "+opStr.orElse("Not Present 1"));
		
		opStr = op.getVal("aaaa");
		
		System.out.println("2nd Time : "+opStr.orElse("Not Present 2"));
	}

}
