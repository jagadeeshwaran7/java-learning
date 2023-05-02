package com.javalearnings.fuelbank;

import java.util.Objects;

public class PetrolTank extends Tank {
    private String tankType;
    private Integer fuelLevel;

    public PetrolTank(final Integer length, final Integer width, final Integer height, String tankType) {
        super(length, width, height);
        this.tankType = tankType;
    }

    public String getTankType() {
        return tankType;
    }

    public void getPetrol(Integer volume) {
        if (fuelLevel >= volume) {
            fuelLevel -= volume;
        }
    }

    public void fillFuel(Fuel fuel, Integer amount) {
        if (Objects.equals(fuel.getFuelType(), "Petrol") && getVolume() >= amount) this.fuelLevel += amount;

    }

    public Integer getFuelLevel() {
        return fuelLevel;
    }
}

