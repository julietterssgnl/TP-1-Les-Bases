package exercice03;

public class Rectangle {
    private double largeur;
    private double hauteur;

    // Constructeur principal qui contient la vraie logique[cite: 1]
    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    // Constructeur pour un carré (délégation via this)[cite: 1]
    public Rectangle(double cote) {
        this(cote, cote);
    }

    // Constructeur par défaut (délégation via this)[cite: 1]
    public Rectangle() {
        this(1.0, 1.0);
    }

    public double aire() {
        return largeur * hauteur;
    }

    public double perimetre() {
        return 2 * (largeur + hauteur);
    }
}