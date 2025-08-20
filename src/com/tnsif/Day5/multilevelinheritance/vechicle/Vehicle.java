package com.tnsif.Day5.multilevelinheritance.vechicle;

import com.tnsif.Day5.multilevelinheritance.vehicle.Maruti800;

public class Vehicle                                          {
    public static void main(String[] args) {
        car c = new car();
        c.vehicleType();

        System.out.println();

        Maruti m = new Maruti();
        m.vehicleType();
        m.brand();
        m.speed();

        System.out.println();

        Maruti800 m1 = new Maruti800();
        m1.vehicleType();
        m1.brand();
        m1.speed();
    }
}

