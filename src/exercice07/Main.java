package exercice07;

public class Main {
    public static void main(String[] args) {
        TelephonePortable tel = new TelephonePortable();
        Lampe lampe = new Lampe();

        tel.allumer();
        tel.connecter("Fibre_Maison");
        tel.deconnecter();
        tel.eteindre();

        System.out.println("---");

        lampe.allumer();
        lampe.eteindre();

        System.out.println("---");

        Allumable[] appareils = new Allumable[] { tel, lampe };
        for (Allumable a : appareils) {
            a.allumer();
            if (a instanceof Connectewifi) {
                Connectewifi wifiDevice = (Connectewifi) a;
                wifiDevice.connecter("4G_Mobile");
                wifiDevice.deconnecter();
            }
            a.eteindre();
        }
    }
}