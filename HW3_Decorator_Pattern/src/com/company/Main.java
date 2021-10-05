package com.company;

import com.company.composites.Elf;
import com.company.composites.Human;
import com.company.composites.Troop;
import com.company.composites.Orc;
import com.company.decorators.Archer;
import com.company.decorators.Magician;
import com.company.decorators.Warrior;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the World of Warcraft!");


        while (true) {
            System.out.println("King, you don't have a troops let's hire them");
            int choose = menu(input);
            switch (choose) {
                case 1:
                    Troop orc = new Orc();
                    int amount1 = trainTroops();
                    orc = classOfTroop(orc);
                    System.out.println(orc.getDescription() + " you pay:" + (amount1 * orc.cost()) + " gold\n");
                    break;
                case 2:
                    Troop human = new Human();
                    int amount2 = trainTroops();
                    human = classOfTroop(human);
                    System.out.println(human.getDescription() + " you pay:" + (amount2 * human.cost()) + " gold\n");
                    break;
                case 3:
                    Troop elf = new Elf();
                    int amount3 = trainTroops();
                    elf = classOfTroop(elf);
                    System.out.println(elf.getDescription() + " you pay:" + (amount3 * elf.cost()) + " gold\n");
                    break;
                default:
                    System.out.println("Wrong!");
                    break;
            }
        }
    }

    public static short menu(Scanner input) {
        short option;
        System.out.println("Welcome to the barracks!");
        System.out.println("1.Orc = 3.00 gold");
        System.out.println("2.Human = 2.00 gold");
        System.out.println("3.Elf = 2.50 gold");
        option = input.nextByte();
        return option;
    }

    public static int trainTroops() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many troops are you need?");
        int amount = input.nextInt();
        return amount;
    }

    public static Troop classOfTroop(Troop troop) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose the class of your warriors");
        System.out.println("1.Archer = 0.50 gold");
        System.out.println("2.Warrior = 0.30 gold");
        System.out.println("3.Wizard = 0.70 gold");
        short option = input.nextByte();
        switch (option) {
            case 1:
                troop = new Archer(troop);
                break;
            case 2:
                troop = new Warrior(troop);
                break;
            case 3:
                troop = new Magician(troop);
                break;
        }
        return troop;
    }
}
