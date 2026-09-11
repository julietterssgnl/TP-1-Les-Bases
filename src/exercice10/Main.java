package exercice10;

public class Main {
    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire("Alice", 150.0);

        System.out.println("Solde au départ : " + compte.getSolde() + " €\n");

        // 1. Retrait valide (dans un try/catch car 'retirer' déclare throws SoldeInsuffisantException)
        try {
            compte.retirer(50.0);
            System.out.println("Retrait réussi ! Nouveau solde : " + compte.getSolde() + " €");
        } catch (SoldeInsuffisantException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- Test 1 : Solde Insuffisant (Checked Exception) ---");
        // 2. Retrait trop élevé : déclenche la Checked Exception
        try {
            compte.retirer(200.0);
        } catch (SoldeInsuffisantException e) {
            System.out.println("Message d'erreur : " + e.getMessage());
            System.out.println("Montant manquant : " + e.getMontantManquant() + " €");
        } finally {
            System.out.println("Bloc FINALLY exécuté - Solde actuel : " + compte.getSolde() + " €");
        }

        System.out.println("\n--- Test 2 : Montant négatif (Unchecked Exception Bonus) ---");
        // 3. Montant négatif : déclenche la Unchecked Exception
        try {
            compte.retirer(-30.0);
        } catch (SoldeInsuffisantException e) {
            System.out.println("Erreur checked : " + e.getMessage());
        } catch (SoldeNulOuNegatifException e) {
            System.out.println("Erreur de sécurité (Unchecked) : " + e.getMessage());
        } finally {
            System.out.println("Bloc FINALLY exécuté - Solde final : " + compte.getSolde() + " €");
        }
    }
}