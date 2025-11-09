package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.exceptions.ZooFullException;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;

public class Zoo {
    private static final int MAX_CAGES = 3; // pour tester l'exception ZooFullException
    private Animal[] animals;
    private int animalCount;
    private String name;
    private String city;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[MAX_CAGES];
        this.animalCount = 0;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {

        if (animal.getAge() < 0) {
            throw new InvalidAgeException("Âge d’animal invalide : l’âge ne peut pas être négatif.");
        }

        if (animalCount >= MAX_CAGES) {
            throw new ZooFullException("Le zoo est plein, impossible d’ajouter un nouvel animal.");
        }


        if (searchAnimal(animal) != -1) {
            System.out.println("Cet animal existe déjà dans le zoo !");
            return;
        }


        animals[animalCount++] = animal;
        System.out.println( animal.getName() + " a été ajouté avec succès !");
    }


    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equalsIgnoreCase(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public void displayZoo() {
        System.out.println("\nZoo Name: " + name + " | City: " + city + " | Nombre d'animaux: " + animalCount);
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }
}
