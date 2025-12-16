package services;

import entities.Employe;
import entities.Departement;

import java.util.HashMap;
import java.util.TreeMap;

public class AffectationHashMap {

    private HashMap<Employe, Departement> affectations;

    public AffectationHashMap() {
        affectations = new HashMap<>();
    }

    // ⃣ Affecter un employé à un département
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e)) {
            System.out.println("⚠️ Employé déjà affecté !");
        } else {
            affectations.put(e, d);
        }
    }

    // ⃣ Affichage des affectations
    public void afficherEmployesEtDepartements() {
        affectations.forEach((e, d) ->
                System.out.println(e + " → " + d));
    }

    // 4️ Supprimer un employé
    public void supprimerEmploye(Employe e) {
        affectations.remove(e);
    }

    // 5️ Supprimer une affectation précise
    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
        }
    }

    // 6️ Afficher les employés
    public void afficherEmployes() {
        affectations.keySet().forEach(System.out::println);
    }

    // 7️ Afficher les départements
    public void afficherDepartements() {
        affectations.values().stream()
                .distinct()
                .forEach(System.out::println);
    }

    // 8️ Rechercher un employé
    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }

    // 9️ Rechercher un département
    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }

    //  Trier les employés par identifiant
    public TreeMap<Employe, Departement> trierMap() {
        return new TreeMap<>(affectations);
    }
}
