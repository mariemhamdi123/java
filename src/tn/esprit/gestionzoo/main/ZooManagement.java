package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.*;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("My Zoo", "Tunis");

        Animal lion = new Animal("Feline", "Lion", 5, true);
        Animal tiger = new Animal("Feline", "Tiger", 4, true);
        Animal dolphin = new Animal("Aquatic", "Dolphin", 8, true);
        Animal penguin = new Animal("Aquatic", "Penguin", -3, false); // test d'âge invalide

        try {
            myZoo.addAnimal(lion);
            myZoo.addAnimal(tiger);
            myZoo.addAnimal(dolphin);
            myZoo.addAnimal(penguin);
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println("⚠️ Erreur : " + e.getMessage());
        }

        myZoo.displayZoo();
        System.out.println("🐾 Nombre total d'animaux dans le zoo : " + myZoo.getAnimalCount());
    }
}
