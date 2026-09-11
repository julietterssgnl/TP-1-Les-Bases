package exercice09;

import java.util.Objects;

public class Etudiant {
    private String numeroEtudiant;
    private String nom;
    private double moyenne;

    public Etudiant(String numeroEtudiant, String nom, double moyenne) {
        this.numeroEtudiant = numeroEtudiant;
        this.nom = nom;
        this.moyenne = moyenne;
    }

    @Override
    public String toString() {
        return "Étudiant n°" + numeroEtudiant + " : " + nom + " (Moyenne : " + moyenne + "/20)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return Objects.equals(numeroEtudiant, etudiant.numeroEtudiant);
    }

    /*
     * REMARQUE DE CONTRAT :
     * Si deux objets sont égaux selon la méthode equals(), ils doivent impérativement
     * retourner le même hashCode(). Si cette règle est enfreinte, les structures de données
     * comme HashSet ou HashMap ne retrouveront pas correctement les éléments.
     */
    @Override
    public int hashCode() {
        return Objects.hash(numeroEtudiant);
    }
}