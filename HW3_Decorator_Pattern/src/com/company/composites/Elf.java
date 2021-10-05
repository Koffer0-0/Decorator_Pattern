package com.company.composites;

public class Elf extends Troop {
    public Elf() {
        description = "Elfs are more agile";
    }

    @Override
    public double cost() {
        return 2.50;
    }
}
