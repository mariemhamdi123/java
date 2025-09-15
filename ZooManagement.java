import java.util.Scanner;

public class ZooManagement {

    public static void main(String[] args) {

        //int nbrCages=20;
        //String zooName = "my zoo";

        Scanner sc = new Scanner(System.in);

        String zooName;
        int nbrCages;

        do {
            System.out.print("Entrez le nom du zoo : ");
            zooName = sc.nextLine().trim();
            if (zooName.isEmpty()) {
                System.out.println("Erreur : le nom du zoo ne doit pas être vide ");
            }
        } while (zooName.isEmpty());


        do {
            System.out.print("Entrez le nombre de cages : ");
            while (!sc.hasNextInt()) {
                System.out.println("Erreur : vous devez entrer un entier positif ");
                sc.next();
                System.out.print("Entrez le nombre de cages : ");
            }
            nbrCages = sc.nextInt();
            if (nbrCages <= 0) {
                System.out.println("Erreur : le nombre de cages doit être positif ");
            }
        } while (nbrCages <= 0);


        System.out.println(zooName + " comporte " + nbrCages + " cages.");

        sc.close();

    }


}