package com.example.homework.model;

import static java.lang.StrictMath.round;

public class Vehicle {

    private String name;
    private double capacity;
    private double fuelUsage;

    public Vehicle(String name, double capacity, double fuelUsage) {
        this.name = name;
        this.capacity = capacity;
        this.fuelUsage = fuelUsage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getFuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(double fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    public double range() {

        double range = 0;
        return range = round(getCapacity() * 100 / getFuelUsage());

    }

    public String toString() {

        String s = "Zasięg samochodu " + range() + ", nazwa samochodu: " + getName() + ", średnie spalanie: " + getFuelUsage() + "/100km, pojemności silnika: " + getCapacity();
        return s;

    }
}
