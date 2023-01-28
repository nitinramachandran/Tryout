package com.nix.tryout.jsonxml;

/**
 * Child class Car
 */
public class Car extends Vehicle{
    private String brand;
    private String model;

    public Car() {

    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Brand : " + this.brand + ", Model : " + this.model +", Fuel : " + super.getFuelType().getDisplayValue();
    }
}
