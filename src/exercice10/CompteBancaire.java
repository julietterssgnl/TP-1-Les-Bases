package exercice10;

public class CompteBancaire {
    private String titulaire;
    private double solde;

    public CompteBancaire(String titulaire, double soldeInitial) {
        this.titulaire = titulaire;
        this.solde = soldeInitial;
    }

    public void retirer(double montant) throws SoldeInsuffisantException {
        if (montant <= 0) {
            throw new SoldeNulOuNegatifException("Le montant du retrait doit être positif.");
        }
        if (montant > solde) {
            double manque = montant - solde;
            throw new SoldeInsuffisantException("Solde insuffisant pour retirer " + montant + " €.", manque);
        }
        solde -= montant;
    }

    public double getSolde() {
        return solde;
    }
}