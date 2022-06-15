package formation;

import java.util.Date;

public class TestPersonne {
    public static void main(String[] args) {
        Stagiaire tintin = new Stagiaire("tintin", "tintin", "05858789",  new Date(), "22 rue de","tintin", "86970");
        System.out.println(tintin);

        tintin.setNom("toto");
        System.out.println(tintin);

        Formateur mrHadock = new Formateur("Hadock", "Hadock", "0499485871", new Date());
        System.out.println(mrHadock);

        Formateur mrHadock2 = new Formateur("Hadocké", "Hadocké", "006857847", new Date());
        System.out.println(mrHadock2);

        Formateur mrHadock3 = new Formateur("Hadock3", "Hadock3", "0721884542", new Date());
        System.out.println(mrHadock3);

    }
}
