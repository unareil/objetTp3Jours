package formation;

public class Formation {
private String nom;
private String prenom;
private String telephone;

    public Formation() {
        super();
    }

    public Formation(String nom, String prenom, String telephone) {
        super();
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
}
