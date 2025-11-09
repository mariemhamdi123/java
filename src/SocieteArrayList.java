import java.util.*;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> {
    private List<Employe> liste = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe e) {
        liste.add(e);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : liste) {
            if (e.getNom().equalsIgnoreCase(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return liste.contains(e);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        liste.remove(e);
    }

    @Override
    public void displayEmploye() {
        for (Employe e : liste)
            System.out.println(e);
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(liste); // Tri naturel (Comparable)
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Comparator<Employe> comp = Comparator
                .comparing(Employe::getNomDepartement)
                .thenComparing(Employe::getGrade)
                .thenComparing(Employe::getNom);

        Collections.sort(liste, comp);
    }

    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> result = new ArrayList<>();
        for (Employe e : liste) {
            if (e.getNomDepartement().equalsIgnoreCase(nomDepartement))
                result.add(e);
        }
        return result;
    }
}
