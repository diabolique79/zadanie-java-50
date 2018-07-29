package com.example.homework.app;

import com.example.homework.model.Car;
import com.example.homework.model.Truck;
import com.example.homework.model.Vehicle;

public class Main {

    public static void main(String[] args) {

        Car[] cars = new Car[2];
        cars[0] = new Car("Kia", 40, 8, false);
        cars[1] = new Truck("Ford", 60, 13, false, 100);

        for (Car veh: cars) {

            System.out.println(veh.toString());

        }

        for (Car veh: cars) {

            ((Car) veh).acOn();
        }

        double range = 0;
        for (Car veh: cars){

            if (veh instanceof Car){

                range = ((Car) veh).rangeNext();
            }

            else if (veh instanceof Truck){

                range = ((Truck) veh).truckRange();
            }

            System.out.println(range);

        }

    }
}
