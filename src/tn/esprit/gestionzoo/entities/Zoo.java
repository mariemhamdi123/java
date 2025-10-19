package tn.esprit.gestionzoo.entities;

public class Zoo {
    private static final int MAX_CAGES = 25;
    private Animal[] animals = new Animal[MAX_CAGES];
    private Aquatic[] aquaticAnimals = new Aquatic[10];
    private String name;
    private String city;
    private int animalCount = 0;
    private int aquaticCount = 0;

    public Zoo() {}

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty())
            this.name = "Unknown Zoo";
        else
            this.name = name;
    }

    public boolean addAnimal(Animal animal) {
        if (animalCount < MAX_CAGES && searchAnimal(animal) == -1) {
            animals[animalCount++] = animal;
            return true;
        }
        return false;
    }

    public boolean addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount < aquaticAnimals.length) {
            aquaticAnimals[aquaticCount++] = aquatic;
            return true;
        }
        return false;
    }

    public void makeAquaticAnimalsSwim() {
        for (int i = 0; i < aquaticCount; i++) {
            aquaticAnimals[i].swim();
        }
    }

    public float maxPenguinDepth() {
        float max = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin p = (Penguin) aquaticAnimals[i];
                if (p.getSwimmingDepth() > max)
                    max = p.getSwimmingDepth();
            }
        }
        return max;
    }

    public void displayNumberOfAquaticByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) dolphinCount++;
            else if (aquaticAnimals[i] instanceof Penguin) penguinCount++;
        }

        System.out.println("Number of dolphins: " + dolphinCount);
        System.out.println("Number of penguins: " + penguinCount);
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal))
                return i;
        }
        return -1;
    }
}
