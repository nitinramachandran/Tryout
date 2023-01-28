package com.nix.tryout.jsonxml;

/**
 * All the fuels used in vehicles
 */
public enum FuelType {
    PETROL("Petrol"),
    DIESEL("Diesel"),
    LITHIUM_BATTERY("Lithium Battery"),
    CRUDE_OIL("Crude Oil"),
    HYDROGEN("Hydrogen");

    private String displayValue;

    FuelType(String displayValue) {
        this.displayValue = displayValue;
    }

    String getDisplayValue() {
        return this.displayValue;
    }
}
