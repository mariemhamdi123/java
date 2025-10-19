public class ZooManagement {
    public static void main(String[] args) {

        Animal lion = new Animal("Feline", "Lion", 5, true);

        Zoo myZoo = new Zoo("My Zoo", "Tunis", 20);

        myZoo.displayZoo();

        System.out.println(myZoo);
        System.out.println(lion);

        Animal tiger = new Animal("Feline", "Tiger", 4, true);
        Animal dolphin = new Animal("Aquatic", "Dolphin", 8, true);

        System.out.println(tiger);
        System.out.println(dolphin);
    }
}
