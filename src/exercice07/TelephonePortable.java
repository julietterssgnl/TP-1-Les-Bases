package exercice07;

public class TelephonePortable implements Allumable, Connectewifi {
    private boolean allume = false;
    private String reseauConnecte = null;

    @Override
    public void allumer() {
        this.allume = true;
        System.out.println("Téléphone allumé.");
    }

    @Override
    public void eteindre() {
        this.allume = false;
        System.out.println("Téléphone éteint.");
    }

    @Override
    public void connecter(String reseau) {
        if (allume) {
            this.reseauConnecte = reseau;
            System.out.println("Téléphone connecté au Wi-Fi : " + reseau);
        } else {
            System.out.println("Impossible de connecter : le téléphone est éteint.");
        }
    }

    @Override
    public void deconnecter() {
        System.out.println("Téléphone déconnecté du Wi-Fi : " + reseauConnecte);
        this.reseauConnecte = null;
    }
}