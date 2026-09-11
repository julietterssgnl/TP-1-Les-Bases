package exercice02;

public class Main {
    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire("Dorine", 500);

        // Utilisation de getTitulaire() et getSolde()
        System.out.println("Titulaire du compte : " + compte.getTitulaire());
        System.out.println("Solde initial de " + compte.getTitulaire() + " : " + compte.getSolde() + " €");

        compte.deposer(200);
        System.out.println("Nouveau solde de " + compte.getTitulaire() + " après dépôt : " + compte.getSolde() + " €");

        try {
            System.out.println("\nTentative de retrait de 1000 €...");
            compte.retirer(1000); // Doit lever une exception[cite: 1]
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur pour " + compte.getTitulaire() + " : " + e.getMessage());
        }

        try {
            System.out.println("\nTentative de dépôt de -50 €...");
            compte.deposer(-50); // Doit lever une exception[cite: 1]
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur pour " + compte.getTitulaire() + " : " + e.getMessage());
        }
    }
}