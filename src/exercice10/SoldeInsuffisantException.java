package exercice10;

public class SoldeInsuffisantException extends Exception { // Checked exception[cite: 1]
    private double montantManquant;

    public SoldeInsuffisantException(String message, double montantManquant) {
        super(message);
        this.montantManquant = montantManquant;
    }

    public double getMontantManquant() {
        return montantManquant;
    }
}