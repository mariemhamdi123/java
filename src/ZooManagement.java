public class ZooManagement {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("My Zoo", "Tunis");

        Animal lion = new Animal("Feline", "Lion", 5, true);
        Animal tiger = new Animal("Feline", "Tiger", 4, true);
        Animal dolphin = new Animal("Aquatic", "Dolphin", 8, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(dolphin);
        myZoo.addAnimal(elephant);

        myZoo.displayAnimals();

        int indexLion = myZoo.searchAnimal(lion);
        System.out.println("Index du lion : " + indexLion);

        Animal lion2 = new Animal("Feline", "Lion", 5, true);
        myZoo.addAnimal(lion2); // doit être refusé

        myZoo.removeAnimal(dolphin);
        myZoo.displayAnimals();

        for (int i = 0; i < 30; i++) {
            myZoo.addAnimal(new Animal("TestFamily", "Animal" + i, i, true));
        }

        Zoo secondZoo = new Zoo("Second Zoo", "Sfax");
        secondZoo.addAnimal(new Animal("Bird", "Parrot", 2, true));
        Zoo biggerZoo = Zoo.comparerZoo(myZoo, secondZoo);
        System.out.println("Le zoo avec le plus d'animaux est : " + biggerZoo.name);
    }
}
