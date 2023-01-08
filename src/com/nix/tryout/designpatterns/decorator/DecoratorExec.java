package com.nix.tryout.designpatterns.decorator;

import java.util.ArrayList;
import java.util.List;

public class DecoratorExec {

	public static void main(String...strings) {
		List<IFace> iFaceList = new ArrayList<>();
		
		iFaceList.add(new ClassOne());
		iFaceList.add(new ClassTwo());
		iFaceList.add(new ClassThree());
		
		
		for(IFace iface : iFaceList) {
			iface.execute();
		}
	}
}
