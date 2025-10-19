public class Zoo {
    public static final int MAX_CAGES = 25;


    private Animal[] animals = new Animal[MAX_CAGES];
    private int animalCount = 0; // compteur d'animaux
    private String name;
    private String city;


    public Zoo() {}

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
    }

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

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Le zoo est plein ! Impossible d'ajouter l'animal " + animal.name);
            return false;
        }
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                System.out.println("Cet animal existe déjà dans le zoo : " + animal.name);
                return false;
            }
        }
        animals[animalCount] = animal;
        animalCount++;
        System.out.println("Animal ajouté : " + animal.name);
        return true;
    }

    public void displayAnimals() {
        if (animalCount == 0) {
            System.out.println("Aucun animal dans le zoo.");
        } else {
            System.out.println("Liste des animaux du zoo:");
            for (int i = 0; i < animalCount; i++) {
                System.out.println(animals[i]);
            }
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("Animal non trouvé : " + animal.name);
            return false;
        }
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null;
        animalCount--;
        System.out.println("Animal supprimé : " + animal.name);
        return true;
    }

    public boolean isZooFull() {
        return animalCount >= MAX_CAGES;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount >= z2.animalCount) {
            return z1;
        } else {
            return z2;
        }
    }
}
