import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instruction 1 : Variables avec valeurs par défaut
        int nbrCages = 20;
        String zooName = "my zoo";

        System.out.println(zooName + " comporte " + nbrCages + " cages.");

        // Instruction 2 : Interaction avec l’utilisateur
        System.out.print("Entrez le nom du zoo : ");
        zooName = sc.nextLine();

        System.out.print("Entrez le nombre de cages : ");
        while (!sc.hasNextInt()) {
            System.out.println("Veuillez entrer un entier positif !");
            sc.next(); // on vide l'entrée incorrecte
        }

        nbrCages = sc.nextInt();

        // Vérification que le nombre est positif
        if (nbrCages <= 0) {
            System.out.println("Le nombre de cages doit être positif !");
            return;
        }

        // Instruction 3 : Affichage final
        System.out.println(zooName + " comporte " + nbrCages + " cages.");

        sc.close();
    }
}
