package com.company.composites;

public class Human extends Troop {
    public Human() {
        description = "Humans are most persistent";
    }

    @Override
    public double cost() {
        return 2.00;
    }
}
