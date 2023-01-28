package com.nix.tryout.jsonxml;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarShowRoom {
    private List<Car> cars;
    private Map<Car, Long> priceMap;

    public CarShowRoom() {
        priceMap = new HashMap<>();
        cars = new ArrayList<>();
    }

    public CarShowRoom(List<Car> cars) {
        priceMap = new HashMap<>();
        this.cars = cars;
    }
}
