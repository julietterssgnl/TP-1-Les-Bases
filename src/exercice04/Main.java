package exercice04;

public class Main {
    public static void main(String[] args) {
        Employe emp = new Employe("Juliette", 2000.0);
        Manager mgr = new Manager("Dorine", 3000.0, 800.0);

        System.out.println("Employé simple : " + emp.getNom());
        System.out.println("Salaire de base : " + emp.calculerSalaire() + " €\n");

        System.out.println("Manager : " + mgr.getNom());
        System.out.println("Salaire total (avec prime) : " + mgr.calculerSalaire() + " €\n");

        Employe[] tableau = new Employe[] { emp, mgr };
        System.out.println("--- Parcours du tableau polymorphe ---");
        for (Employe e : tableau) {
            System.out.println(e.getNom() + " gagne " + e.calculerSalaire() + " €");
        }
    }
}