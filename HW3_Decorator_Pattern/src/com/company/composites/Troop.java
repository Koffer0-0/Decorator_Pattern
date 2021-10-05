package com.company.composites;

public abstract class Troop {
    String description = "Unknown troop";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
