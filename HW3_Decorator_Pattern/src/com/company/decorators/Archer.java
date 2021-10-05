package com.company.decorators;

import com.company.composites.Troop;

public class Archer extends Decorator {
    Troop troop;

    public Archer(Troop troop) {
        this.troop = troop;
    }

    @Override
    public String getDescription() {
        return troop.getDescription() + ", Bow and Arrows";
    }

    @Override
    public double cost() {
        return .50 + troop.cost();
    }
}
