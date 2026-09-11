package exercice08;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate arriveeEt = LocalDate.of(2026, 7, 15);
        LocalDate departEt = LocalDate.of(2026, 7, 25);

        Reservation r1 = new Reservation("Rossignol", arriveeEt, departEt);
        Reservation r2 = new Reservation("Barbey", LocalDate.of(2026, 11, 1), LocalDate.of(2026, 11, 10));

        System.out.println("Client : " + r1.getNomClient());
        System.out.println("Date d'arrivée : " + r1.getDateArrivee());
        System.out.println("Durée : " + r1.dureeSejour() + " nuits");
        System.out.println("Haute saison pour cette date ? " + Reservation.estEnHauteSaison(r1.getDateArrivee()) + "\n");

        System.out.println("Client : " + r2.getNomClient());
        System.out.println("Haute saison pour novembre ? " + Reservation.estEnHauteSaison(r2.getDateArrivee()) + "\n");

        try {
            new Reservation("Invalide", LocalDate.of(2026, 8, 10), LocalDate.of(2026, 8, 5));
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur interceptée avec succès : " + e.getMessage());
        }
    }
}