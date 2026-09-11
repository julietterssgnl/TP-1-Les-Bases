package exercice04;

public class Main {
    public static void main(String[] args) {
        Employe[] employes = new Employe[] {
                new Employe("Bob", 2000),
                new Manager("Alice", 3000, 800),
                new Employe("Charlie", 2200)
        };

        for (Employe e : employes) {
            System.out.println("Employé : " + e.getNom() + " | Salaire : " + e.calculerSalaire() + " €");
        }
    }
}