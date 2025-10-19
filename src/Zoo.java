public class Zoo {
    // Attributs
    Animal[] animals = new Animal[25];
    String name;
    String city;
    int nbrCages;


    public Zoo() {}

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of cages: " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo [name=" + name + ", city=" + city + ", nbrCages=" + nbrCages + "]";
    }
}
