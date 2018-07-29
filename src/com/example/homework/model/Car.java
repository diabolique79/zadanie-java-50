package com.example.homework.model;

import static java.lang.StrictMath.round;

public class Car extends Vehicle {

    private boolean ac;

    public Car(String name, double capacity, double fuelUsage, boolean ac) {
        super(name, capacity, fuelUsage);
        this.ac = ac;

    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public void acOn() {

        ac = true;
        System.out.println("Klimatyzacja włączona.");
    }


//    @Override
//    public double range() {
//        if (ac = true) {
//            double range;
//            return range = round(getCapacity() * 100 / (getFuelUsage() + 0.8));
//        }
//        return range();
//
//        }

    public double rangeNext() {

        double range = 0;

      if (ac = true) {

            return range = round(getCapacity() * 100 / (getFuelUsage() + 0.8));
       }

        return range;
    }


    }





