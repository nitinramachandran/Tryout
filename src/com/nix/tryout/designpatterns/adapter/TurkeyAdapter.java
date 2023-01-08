package com.nix.tryout.designpatterns.adapter;

public class TurkeyAdapter implements Duck{

	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		
		// The way turkey flies is short spurts of 6
		for(int i = 0; i < 6; ++i) {
			turkey.fly();
		}
	}
}