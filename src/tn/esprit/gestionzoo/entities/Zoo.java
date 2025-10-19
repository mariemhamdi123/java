package tn.esprit.gestionzoo.entities;

public class Zoo {
    public static final int MAX_CAGES = 25;

    private String name;
    private String city;
    private Animal[] animals = new Animal[MAX_CAGES];
    private int animalCount = 0;

    public Zoo() {}

    public Zoo(String name, String city) {
        setName(name); // validation
        this.city = city;
    }

    // Getters et Setters
    public String getName() { return name; }
    public void setName(String name) {
        if (name == null || name.trim().isEmpty())
            System.out.println("Erreur : nom du zoo vide ignoré.");
        else this.name = name;
    }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public int getAnimalCount() { return animalCount; }

    // Affichage
    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of cages: " + MAX_CAGES);
        System.out.println("Number of animals: " + animalCount);
    }

    @Override
    public String toString() {
        return "Zoo [name=" + name + ", city=" + city + ", animalCount=" + animalCount + "]";
    }

    // 17. Ajouter un animal
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Zoo plein ! Impossible d'ajouter : " + animal.getName());
            return false;
        }
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                System.out.println("Animal déjà existant : " + animal.getName());
                return false;
            }
        }
        animals[animalCount] = animal;
        animalCount++;
        System.out.println("Animal ajouté : " + animal.getName());
        return true;
    }

    // Afficher tous les animaux
    public void displayAnimals() {
        if (animalCount == 0) System.out.println("Aucun animal.");
        else {
            System.out.println("Liste des animaux :");
            for (int i = 0; i < animalCount; i++) System.out.println(animals[i]);
        }
    }

    // Chercher un animal
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++)
            if (animals[i].equals(animal)) return i;
        return -1;
    }

    // Supprimer un animal
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("Animal non trouvé : " + animal.getName());
            return false;
        }
        for (int i = index; i < animalCount - 1; i++) animals[i] = animals[i + 1];
        animals[animalCount - 1] = null;
        animalCount--;
        System.out.println("Animal supprimé : " + animal.getName());
        return true;
    }

    public boolean isZooFull() { return animalCount >= MAX_CAGES; }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) { return (z1.animalCount >= z2.animalCount) ? z1 : z2; }
}
