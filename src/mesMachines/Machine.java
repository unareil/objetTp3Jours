package mesMachines;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Machine {
    private LocalDate dateAchat;
    private String marque;
    private String modele;

    public Machine() {
    }
    public Machine(LocalDate dateAchat, String marque, String modele) {
        this.setDateAchat(dateAchat);
        this.setMarque(marque);
        this.setModele(modele);
    }

    public long getAge() {
        return ChronoUnit.YEARS.between(dateAchat, LocalDate.now());
    }

    public LocalDate getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(LocalDate dateAchat) {
        this.dateAchat = dateAchat;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    /** *
     * {@inheritDoc}
     **
     * @see java.lang.Object#toString()
     * */@Override
    public String toString() {
         long age = getAge();
         return marque+" "+modele+" ("+age+" an"+(age>1?"s":"")+")";
     }
}
