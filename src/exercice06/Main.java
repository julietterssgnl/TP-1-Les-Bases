package exercice06;

public class Main {
    public static void main(String[] args) {
        // Forme f = new Forme(); // Impossible d'instancier une classe abstraite[cite: 1]

        Cercle cercle = new Cercle(3.0);
        Rectangle rectangle = new Rectangle(4.0, 5.0);
        Triangle triangle = new Triangle(4.0, 3.0);

        System.out.println("Aire du cercle (calcul brut) : " + cercle.aire());
        System.out.println("Aire du rectangle (calcul brut) : " + rectangle.aire());
        System.out.println("Aire du triangle (calcul brut) : " + triangle.aire() + "\n");

        Forme[] formes = new Forme[] { cercle, rectangle, triangle };
        System.out.println("--- Affichage via afficherAire() ---");
        for (Forme f : formes) {
            f.afficherAire();
        }

        Forme plusGrandeForme = Forme.plusGrande(formes);
        System.out.print("\nRésultat de la méthode plusGrande() : ");
        plusGrandeForme.afficherAire();
    }
}