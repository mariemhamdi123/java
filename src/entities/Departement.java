package entities;

public class Departement {
    private int id;
    private String nom;

    public Departement(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Departement)) return false;
        Departement d = (Departement) obj;
        return this.id == d.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public String toString() {
        return "Departement{id=" + id + ", nom='" + nom + "'}";
    }
}
