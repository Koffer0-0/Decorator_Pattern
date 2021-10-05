package com.company.composites;

public class Orc extends Troop {
    public Orc() {
        description = "Orcs are strong";
    }

    @Override
    public double cost() {
        return 3.00;
    }
}
