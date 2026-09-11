package exercice02;

public class CompteBancaire {
    private double solde; // Private[cite: 1]
    private String titulaire; // Private[cite: 1]

    public CompteBancaire(String titulaire, double soldeInitial) {
        if (soldeInitial < 0) {
            throw new IllegalArgumentException("Le solde initial ne peut pas être négatif.");
        }
        this.titulaire = titulaire;
        this.solde = soldeInitial;
    }

    public double getSolde() {
        return solde;
    }

    public String getTitulaire() {
        return titulaire;
    }

    // Aucun setter direct pour le solde[cite: 1]

    public void deposer(double montant) {
        if (montant <= 0) {
            throw new IllegalArgumentException("Le montant du dépôt doit être strictement positif.");
        }
        this.solde += montant;
    }

    public void retirer(double montant) {
        if (montant <= 0) {
            throw new IllegalArgumentException("Le montant du retrait doit être strictement positif.");
        }
        if (montant > this.solde) {
            throw new IllegalArgumentException("Solde insuffisant pour un retrait de " + montant + " €.");
        }
        this.solde -= montant;
    }
}