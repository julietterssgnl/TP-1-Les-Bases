package exercice01;

public class Main {
    public static void main(String[] args) {
        Livre l1 = new Livre("Le Comte de Monte-Cristo", "Alexandre Dumas", 1200);
        Livre l2 = new Livre("L'Étranger", "Albert Camus", 180);

        l1.emprunter();
        l1.emprunter(); // Doit refuser car déjà emprunté[cite: 1]
        l1.rendre();
        l1.emprunter();
    }
}