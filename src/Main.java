import entities.*;
import services.*;

public class Main {
    public static void main(String[] args) {

        Employe e1 = new Employe(1, "Ali");
        Employe e2 = new Employe(2, "Sara");

        Departement d1 = new Departement(10, "IT");
        Departement d2 = new Departement(20, "RH");

        AffectationHashMap gestion = new AffectationHashMap();

        gestion.ajouterEmployeDepartement(e1, d1);
        gestion.ajouterEmployeDepartement(e2, d2);

        // Test double affectation
        gestion.ajouterEmployeDepartement(e1, d2);

        System.out.println("\n📌 Affectations :");
        gestion.afficherEmployesEtDepartements();

        System.out.println("\n📌 Employés triés :");
        gestion.trierMap().forEach((e, d) ->
                System.out.println(e + " → " + d));
    }
}
