package exercice08;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Reservation {
    private String nomClient;
    private LocalDate dateArrivee;
    private LocalDate dateDepart;

    public Reservation(String nomClient, LocalDate dateArrivee, LocalDate dateDepart) {
        if (dateDepart.isBefore(dateArrivee) || dateDepart.isEqual(dateArrivee)) {
            throw new IllegalArgumentException("La date de départ doit être strictement après la date d'arrivée.");
        }
        this.nomClient = nomClient;
        this.dateArrivee = dateArrivee;
        this.dateDepart = dateDepart;
    }

    public long dureeSejour() {
        return ChronoUnit.DAYS.between(dateArrivee, dateDepart);
    }

    public static boolean estEnHauteSaison(LocalDate date) {
        Month mois = date.getMonth();
        return mois == Month.JULY || mois == Month.AUGUST;
    }

    public String getNomClient() {
        return nomClient;
    }

    public LocalDate getDateArrivee() {
        return dateArrivee;
    }
}