package exercice05;

public class Produit {
    private String nom;
    private double prix;

    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public void afficher() {
        System.out.println("Produit : " + nom + " | Prix : " + prix + " €");
    }

    public void afficher(double remisePourcentage) {
        double prixRemise = prix * (1 - remisePourcentage / 100.0);
        System.out.println("Produit : " + nom + " | Prix avec remise (" + remisePourcentage + "%) : " + prixRemise + " €");
    }

    public void afficher(String devise) {
        System.out.println("Produit : " + nom + " | Prix : " + prix + " " + devise);
    }
}