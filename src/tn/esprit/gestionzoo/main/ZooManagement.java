package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("My Zoo", "Tunis");

        Animal lion = new Animal("Feline", "Lion", 5, true);
        Animal tiger = new Animal("Feline", "Tiger", 4, true);
        Animal dolphin = new Animal("Aquatic", "Dolphin", 8, true);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(dolphin);

        myZoo.displayAnimals();

        System.out.println("Index du Lion : " + myZoo.searchAnimal(lion));
        myZoo.removeAnimal(dolphin);
        myZoo.displayAnimals();

        Zoo secondZoo = new Zoo("Second Zoo", "Sfax");
        secondZoo.addAnimal(new Animal("Bird", "Parrot", 2, true));

        Zoo biggerZoo = Zoo.comparerZoo(myZoo, secondZoo);
        System.out.println("Le zoo avec le plus d'animaux est : " + biggerZoo.getName());
    }
}
