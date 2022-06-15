package formation;

public class Personne {
private String nom;
private String prenom;
private String telephone;

    public Personne() {
    }

    public Personne(String nom, String prenom, String telephone) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setTelephone(telephone);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Personne{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append(", telephone='").append(telephone).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
