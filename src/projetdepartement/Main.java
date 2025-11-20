package projetdepartement;

public class Main {
    public static void main(String[] args) {

        DepartementHashSet gestion = new DepartementHashSet();

        Departement d1 = new Departement(1, "Informatique", 10);
        Departement d2 = new Departement(2, "RH", 5);
        Departement d3 = new Departement(3, "Comptabilité", 7);
        Departement d4 = new Departement(1, "Informatique", 10); // doublon

        gestion.ajouterDepartement(d1);
        gestion.ajouterDepartement(d2);
        gestion.ajouterDepartement(d3);
        gestion.ajouterDepartement(d4); // ignoré

        System.out.println("=== Liste des départements ===");
        gestion.afficherDepartements();

        System.out.println("\n=== Recherche par nom 'RH' ===");
        System.out.println(gestion.rechercherDepartement("RH") ? "Trouvé" : "Non trouvé");

        System.out.println("\n=== Suppression du département 'Comptabilité' ===");
        gestion.supprimerDepartement(d3);
        gestion.afficherDepartements();

        System.out.println("\n=== Tri par ID ===");
        gestion.trierDepartementsParId();

        System.out.println("\n=== Tri par nom et nombre d'employés ===");
        gestion.trierDepartementsParNomEtNombreEmployes();
    }
}
