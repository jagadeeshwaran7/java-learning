package com.javalearnings.extendingclass;

public class PetrolEngine extends Engine {
    private final Integer fuelCapacity;
    public PetrolEngine(final Integer fuelCapacity) {
        super("Petrol");
        this.fuelCapacity = fuelCapacity;
        System.out.println("Petrol engine created");

    }

    public Integer getFuelCapacity() {return fuelCapacity;}
}
