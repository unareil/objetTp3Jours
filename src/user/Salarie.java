package user;

public class Salarie extends Individu{
   private int salaire;

   public Salarie() {
      super();
   }

   public Salarie(int salaire) {
      super();
      this.setSalaire(salaire);
   }

   public Salarie(String nom, String prenom, int salaire) {
      super(nom, prenom);
      this.salaire = salaire;
   }

   public int getSalaire() {
      return salaire;
   }

   public void setSalaire(int salaire) {
      this.salaire = salaire;
   }

   @Override
   public String toString() {
      final StringBuffer sb = new StringBuffer();
      sb.append(super.toString());
      sb.append("salaire=").append(salaire);
      sb.append('}');
      return sb.toString();
   }
}

