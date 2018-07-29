package com.example.homework.model;

import static java.lang.StrictMath.round;

public class Truck extends Car {

    private double weight;


    public Truck(String name, double capacity, double fuelUsage, boolean ac, double weight) {
        super(name, capacity, fuelUsage, ac);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public double truckRange(){

        double range = 0;

        return range = round(getCapacity() * 100 / (getFuelUsage() + 1.6));

    }

}
