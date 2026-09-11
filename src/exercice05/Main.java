package exercice05;

public class Main {
    public static void main(String[] args) {
        Produit p = new Produit("Clavier Mécanique", 100.0);

        p.afficher();
        p.afficher(15.0); // 15% de remise[cite: 1]
        p.afficher("USD");
    }
}