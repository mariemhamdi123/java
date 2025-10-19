package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("My Zoo", "Tunis");

        Dolphin d1 = new Dolphin("Mammal", "Flipper", 8, true, "Ocean", 25.5f);
        Penguin p1 = new Penguin("Bird", "Pingu", 5, false, "Arctic", 30.0f);
        Penguin p2 = new Penguin("Bird", "Chilly", 4, false, "Arctic", 40.0f);

        zoo.addAquaticAnimal(d1);
        zoo.addAquaticAnimal(p1);
        zoo.addAquaticAnimal(p2);

        zoo.makeAquaticAnimalsSwim();
        System.out.println("Max penguin depth: " + zoo.maxPenguinDepth());
        zoo.displayNumberOfAquaticByType();
    }
}
