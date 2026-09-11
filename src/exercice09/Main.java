package exercice09;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Etudiant> liste = new ArrayList<>();

        Etudiant e1 = new Etudiant("E123", "Juliette", 15.5);
        Etudiant e2 = new Etudiant("E123", "juju", 18.0); // Même numéro d'étudiant[cite: 1]
        Etudiant e3 = new Etudiant("E456", "Dorine", 12.0);

        liste.add(e1);

        System.out.println(e1);
        System.out.println("e1 est-il égal à e2 ? " + e1.equals(e2)); // true[cite: 1]
        System.out.println("La liste contient-elle e2 ? " + liste.contains(e2)); // true[cite: 1]
        System.out.println("La liste contient-elle e3 ? " + liste.contains(e3)); // false
    }
}