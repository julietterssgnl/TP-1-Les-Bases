package exercice02;

public class Main {
    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire("Alice", 500);

        compte.deposer(200);
        System.out.println("Solde après dépôt : " + compte.getSolde() + " €");

        try {
            compte.retirer(1000); // Doit lever une exception[cite: 1]
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur interceptée : " + e.getMessage());
        }

        try {
            compte.deposer(-50); // Doit lever une exception[cite: 1]
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur interceptée : " + e.getMessage());
        }
    }
}