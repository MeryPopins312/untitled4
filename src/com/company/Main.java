package com.company;

public class Main {

    public static void main(String[] args) {

        Hero[] superAbilities = {new Magic(), new Medic(), new Warrior()};
        for (int i = 0; i < superAbilities.length; i++) {
           superAbilities[i].applySuperAbility();
        }
    }
}

