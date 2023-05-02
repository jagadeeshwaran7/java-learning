package com.javalearnings.fuelbank;

public class DieselTank extends Tank{
    private String tankType;
    private Integer fuelLevel;

    public DieselTank(final Integer length, final Integer width, final Integer height, String tankType) {
        super(length, width, height);
        this.tankType = tankType;
    }

    public String getTankType() {
        return tankType;
    }
    public void getPetrol(Integer volume) {
        fuelLevel -= volume;
    }

    public void fillFuel(Integer amount) {
        this.fuelLevel += amount;
    }

    public Integer getFuelLevel() {
        return fuelLevel;
    }

}
