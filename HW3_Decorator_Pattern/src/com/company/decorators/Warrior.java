package com.company.decorators;

import com.company.composites.Troop;

public class Warrior extends Decorator {
    Troop troop;

    public Warrior(Troop troop) {
        this.troop = troop;
    }

    @Override
    public String getDescription() {
        return troop.getDescription() + ", Sword and Shield";
    }

    @Override
    public double cost() {
        return .30 + troop.cost();
    }
}
