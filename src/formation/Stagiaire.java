package formation;

import java.util.Date;

public class Stagiaire extends Personne{
    private Date dateNaissance;
    private String adresse;
    private String ville;
    private String codePostal;

    public Stagiaire() {
        super();
    }

    public Stagiaire(String nom, String prenom, String telephone, Date dateNaissance, String adresse, String ville, String codePostal) {
        super(nom, prenom, telephone);
        this.setDateNaissance(dateNaissance);
        this.setAdresse(adresse);
        this.setVille(ville);
        this.setCodePostal(codePostal);
    }

    public Stagiaire(String nom, String prenom, String telephone) {
        super(nom, prenom, telephone);
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Stagiaire{");
        sb.append(super.toString());
        sb.append("dateNaissance=").append(dateNaissance);
        sb.append(", adresse='").append(adresse).append('\'');
        sb.append(", ville='").append(ville).append('\'');
        sb.append(", codePostal='").append(codePostal).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
