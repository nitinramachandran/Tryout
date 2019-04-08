package com.nix.tryout.generics;

import java.util.ArrayList;
import java.util.List;

public class TestRental {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car();
		
		List<Car> carList = new ArrayList<Car>();
		carList.add(c1);
		carList.add(c2);
		
		RentalGeneric<Car> carRental = new RentalGeneric<Car>(2, carList);
		
		Car carToRent = carRental.getRental();

		// Can't do the below
	//	carList.add(new Cat());
		

	}

}
