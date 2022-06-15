package formation;

import java.util.Date;

public class Formateur extends Personne{
    private int numeroIntervenant = 1;
    private Date dateDeCreation;
    private static int nombreIntervenant;

    public Formateur() {
        super();
    }

    public Formateur(String nom, String prenom, String telephone, Date dateDeCreation) {
        super(nom, prenom, telephone);
        this.setNombreIntervenant();
        this.setNumeroIntervenant();
        this.setDateDeCreation(dateDeCreation);
    }

    public Formateur(String nom, String prenom, String telephone) {
        super(nom, prenom, telephone);
    }

    public int getNumeroIntervenant() {
        return numeroIntervenant;
    }

    public void setNumeroIntervenant() {
        this.numeroIntervenant = nombreIntervenant;
    }

    public Date getDateDeCreation() {
        return dateDeCreation;
    }

    public void setDateDeCreation(Date dateDeCreation) {
        this.dateDeCreation = dateDeCreation;
    }

    public int getNombreIntervenant() {
        return nombreIntervenant;
    }

    public void setNombreIntervenant() {
        this.nombreIntervenant++;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Formateur{");
        sb.append(super.toString());
        sb.append("numeroIntervenant=").append(numeroIntervenant);
        sb.append(", dateDeCreation=").append(dateDeCreation);
        sb.append(", nombreIntervenant=").append(nombreIntervenant);
        sb.append('}');
        return sb.toString();
    }
}


