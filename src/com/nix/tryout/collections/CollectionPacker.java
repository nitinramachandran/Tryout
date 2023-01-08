package com.nix.tryout.collections;

import java.util.Collection;

public class CollectionPacker {
	
	public <I extends Collection<Address>> Collection<Address> getAddresses(I i) {
		
		Address addr1 = new Address();
		Address addr2 = new Address();
		Address addr3 = new Address();
		Address addr4 = new Address();
		
		addr1.setCountry("Zambia");
		addr2.setCountry("India");
		addr3.setCountry("China");
		addr4.setCountry("America");
		
		i.add(addr1);
		i.add(addr2);
		i.add(addr3);
		i.add(addr4);
		
		return i;
	}
	
	public <I extends Collection<Student>> Collection<Student> getStudents(I i) {
		
		Student stud1 = new Student();
		Student stud2 = new Student();
		Student stud3 = new Student();
		Student stud4 = new Student();
		
		stud1.setFirstName("ram");
		stud2.setFirstName("sreeju");
		stud3.setFirstName("bitu");
		stud4.setFirstName("chinju");
		
		stud1.setLastName("babu");
		stud2.setLastName("hari");
		stud3.setLastName("nandan");
		stud4.setLastName("mankave");
		
		i.add(stud1);
		i.add(stud2);
		i.add(stud3);
		i.add(stud4);
		
		return i;
	}
}
