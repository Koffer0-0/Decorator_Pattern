package com.company.decorators;

import com.company.composites.Troop;

public class Magician extends Decorator {
    Troop troop;

    public Magician(Troop troop) {
        this.troop = troop;
    }

    @Override
    public String getDescription() {
        return troop.getDescription() + ", Cloak and Stuff";
    }

    @Override
    public double cost() {
        return .70 + troop.cost();
    }
}
