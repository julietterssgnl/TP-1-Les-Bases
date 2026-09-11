package exercice01;

public class Livre {
    private String titre;
    private String auteur;
    private int nombrePages;
    private boolean disponible;

    public Livre(String titre, String auteur, int nombrePages) {
        this.titre = titre; // Utilisé pour lever l'ambiguïté entre attributs et paramètres[cite: 1]
        this.auteur = auteur;
        this.nombrePages = nombrePages;
        this.disponible = true; // Disponible par défaut[cite: 1]
    }

    public void emprunter() {
        if (this.disponible) {
            this.disponible = false;
            System.out.println("Le livre « " + this.titre + " » a été emprunté.");
        } else {
            System.out.println("Le livre « " + this.titre + " » n'est pas disponible.");
        }
    }

    public void rendre() {
        this.disponible = true;
        System.out.println("Le livre « " + this.titre + " » a été rendu.");
    }
}