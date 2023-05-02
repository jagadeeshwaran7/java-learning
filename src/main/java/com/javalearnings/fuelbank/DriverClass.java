package com.javalearnings.fuelbank;

public class DriverClass {

    public static void main(String[] args) {

        PetrolTank petrolTank = new PetrolTank(10, 20, 30, "Petrol");
        DieselTank dieselTank = new DieselTank(10, 20, 30, "Diesel");
        Fuel petrol = new Fuel("Petrol");
        System.out.println("Volume : " + petrolTank.getFuelLevel() + " Lit");
        System.out.println("Tank Type: " + petrolTank.getTankType());
        petrolTank.fillFuel(petrol, 100);
        System.out.println("Volume : " + petrolTank.getFuelLevel() + " Lit");

    }
}
