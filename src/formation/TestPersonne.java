package formation;

import java.util.Date;

public class TestPersonne {
    public static void main(String[] args) {
        Stagiaire tintin = new Stagiaire("tintin", "tintin", "05858789",  new Date(), "22 rue de","tintin", "86970");
        System.out.println(tintin);

        tintin.setNom("toto");
        System.out.println(tintin);

        Formateur mrHadock = new Formateur("Hadock", "Hadock", "0499485871", 4170, new Date(), 1);

        mrHadock.setNombreIntervenant(2);
        System.out.println(mrHadock);

    }
}
