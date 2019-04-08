package com.nix.tryout.immutable;

import java.util.List;

public class ImmutableTryout {

	public static void main(String[] args) {
		Immutable im1 = new Immutable();
		Immutable im2 = new Immutable();
		im1 = im2;
		
		System.out.println(im1 == im2);

	}

}

final class Immutable{

	private List lst;
}