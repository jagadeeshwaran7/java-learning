package com.javalearnings.extendingclass;

public class HondaOldBike extends PetrolEngine {
    private final String bikeModel;
    private Integer mileage;

    public HondaOldBike(String bikeModel, Integer mileage, Integer fuelCapacity) {
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

    public static void main(String[] args) {
        /*TvsBike tvsBike = new TvsBike("Shine", 60, 15);
        tvsBike.selfStart();
        PetrolEngine petrolEngine = tvsBike;
        TvsBike tvsBike2 = (TvsBike) petrolEngine;
        System.out.println(tvsBike2.getBikeModel());
        Engine engine = tvsBike;
        petrolEngineFactory(petrolEngine);
        engineFactory(engine);*/
        Integer a = 30;
        Double b = new Double(20.3);
        double l = b;
        Number x = a;
        Double c = (Double) x;
        System.out.println(c);
    }
    public static void petrolEngineFactory(PetrolEngine petrolEngine) {
        System.out.println("Inside petrol engine factory");
        System.out.println(petrolEngine.getFuelCapacity());
    }

    public static void engineFactory(Engine engine) {
        System.out.println("Inside engine factory");
        System.out.println(engine.getCurrentState());
    }
}
