package com.nix.tryout.behaviour;

public class ObjectPlay {
	
	public void meth(Pojo pojo) {
		
		System.out.println(pojo);
		
		pojo = meth2(pojo); 
				
		System.out.println(pojo);
	}
	
	public Pojo meth2(Pojo pojo) {
		pojo.setId(2);
		pojo.setName("Jabbar");
		pojo.setAge(11);
		
		return pojo;
	}

	public static void main(String[] args) {
		ObjectPlay pl = new ObjectPlay();
		
		Pojo p = new Pojo();
		p.setId(1);
		p.setAge(21);
		p.setName("Nitin");
		
		pl.meth(p);
	}
}