package com.tnsif.Day5.multilevelinheritance.vehicle;

import com.tnsif.Day5.multilevelinheritance.vechicle.Maruti;

public class Maruti800 extends Maruti {
    public Maruti800() {
        System.out.println("Maruti Model: 800");
    }

    @Override
    public void speed() {
        System.out.println("Max: 80Kmph");
    }
}

