import java.util.List;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(3, "Ali", "Ben", "Informatique", 2);
        Employe e2 = new Employe(1, "Sana", "Trabelsi", "RH", 3);
        Employe e3 = new Employe(2, "Khaled", "Ayari", "Informatique", 1);

        // Ajout
        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        System.out.println("=== Liste initiale ===");
        societe.displayEmploye();

        System.out.println("\n=== Tri par ID ===");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\n=== Tri par Département, Grade et Nom ===");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        System.out.println("\n=== Recherche par nom 'Sana' ===");
        System.out.println(societe.rechercherEmploye("Sana"));

        System.out.println("\n=== Recherche par département 'Informatique' ===");
        List<Employe> list = societe.rechercherParDepartement("Informatique");
        for (Employe e : list)
            System.out.println(e);
    }
}
