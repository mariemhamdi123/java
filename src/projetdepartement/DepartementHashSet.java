package projetdepartement;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {

    private Set<Departement> departements = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement d) {
        departements.add(d);
    }

    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        for (Departement d : departements) {
            if (d.getNomDepartement().equalsIgnoreCase(nomDepartement)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return departements.contains(d);
    }

    @Override
    public void supprimerDepartement(Departement d) {
        departements.remove(d);
    }

    @Override
    public void afficherDepartements() {
        for (Departement d : departements) {
            System.out.println(d);
        }
    }

    @Override
    public void trierDepartementsParId() {
        TreeSet<Departement> ts = new TreeSet<>(
                (d1, d2) -> Integer.compare(d1.getId(), d2.getId())
        );
        ts.addAll(departements);
        ts.forEach(System.out::println);
    }

    @Override
    public void trierDepartementsParNomEtNombreEmployes() {
        TreeSet<Departement> ts = new TreeSet<>(
                (d1, d2) -> {
                    int c = d1.getNomDepartement().compareToIgnoreCase(d2.getNomDepartement());
                    if (c != 0) return c;
                    return Integer.compare(d1.getNombreEmployes(), d2.getNombreEmployes());
                }
        );
        ts.addAll(departements);
        ts.forEach(System.out::println);
    }
}
