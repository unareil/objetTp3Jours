package formation;

import java.util.Date;

public class Formateur extends Personne{
    private int numeroIntervenant;
    private Date dateDeCreation;
    private int nombreIntervenant;

    public Formateur() {
        super();
    }

    public Formateur(int numeroIntervenant, Date dateDeCreation, int nombreIntervenant) {
        super();
        this.setNumeroIntervenant(numeroIntervenant);
        this.setDateDeCreation(dateDeCreation);
        this.setNombreIntervenant(nombreIntervenant);
    }

    public Formateur(String nom, String prenom, String telephone) {
        super(nom, prenom, telephone);
    }

    public int getNumeroIntervenant() {
        return numeroIntervenant;
    }

    public void setNumeroIntervenant(int numeroIntervenant) {
        this.numeroIntervenant = numeroIntervenant;
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

    public void setNombreIntervenant(int nombreIntervenant) {
        this.nombreIntervenant = nombreIntervenant;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Formateur{");
        sb.append("numeroIntervenant=").append(numeroIntervenant);
        sb.append(", dateDeCreation=").append(dateDeCreation);
        sb.append(", nombreIntervenant=").append(nombreIntervenant);
        sb.append('}');
        return sb.toString();
    }
}


