package com.javalearnings.extendingclass;

public class TvsBike extends PetrolEngine {
    private final String bikeModel;
    private Integer mileage;


    public TvsBike(String bikeModel, Integer mileage, Integer fuelCapacity) {
        super(fuelCapacity);
        this.bikeModel = bikeModel;
        this.mileage = mileage;
        System.out.println("Honda old bike created");
    }

    public String getBikeModel() {return bikeModel;}

    public Integer getMileage() {return mileage;}

    public void setMileage(Integer mileage) {this.mileage = mileage;}

    public void selfStart() {
        this.start();
    }
}
