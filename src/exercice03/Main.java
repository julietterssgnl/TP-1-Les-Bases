package exercice03;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5.0, 3.0);
        Rectangle r2 = new Rectangle(4.0);
        Rectangle r3 = new Rectangle();

        System.out.println("Rectangle 1 - Aire: " + r1.aire() + ", Périmètre: " + r1.perimetre());
        System.out.println("Rectangle 2 (carré) - Aire: " + r2.aire() + ", Périmètre: " + r2.perimetre());
        System.out.println("Rectangle 3 (par défaut) - Aire: " + r3.aire() + ", Périmètre: " + r3.perimetre());
    }
}