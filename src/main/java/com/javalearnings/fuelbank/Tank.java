package com.javalearnings.fuelbank;

public class Tank {
    private final Integer volume;
    public Tank(final Integer length, final Integer width, final Integer height) {
        this.volume = length * width * height;
    }

    public Integer getVolume() {
        return volume;
    }
}
