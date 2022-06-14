package user;

public class TestSalarie {
    public static void main(String[] args) {
        Individu am=new Individu();
        am.setNom("Aurélien");
        am.setPrenom("Martineau");

        System.out.println("Individu = \n"+am);

        Salarie ak=new Salarie();
        ak.setNom("Alain");
        ak.setPrenom("Kerlero");
        ak.setSalaire(5000);

        System.out.println("Individu : \n"+am);
        System.out.println("Salarie : \n"+ak);
    }
}
