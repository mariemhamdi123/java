package entities;

public class Employe implements Comparable<Employe> {
    private int id;
    private String nom;

    public Employe(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Employe e) {
        return Integer.compare(this.id, e.id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employe)) return false;
        Employe e = (Employe) obj;
        return this.id == e.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public String toString() {
        return "Employe{id=" + id + ", nom='" + nom + "'}";
    }
}
