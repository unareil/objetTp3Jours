package mesMachines;

import java.time.LocalDate;

public class PompeAGravitation extends Machine{
    private int debit;
    private boolean eauOperationnelle;

    public PompeAGravitation() {
    }

    public PompeAGravitation(LocalDate dateAchat, String marque, String modele, int debit, boolean eauOperationnelle) {
        super(dateAchat, marque, modele);
        this.setDebit(debit);
        this.setEauOperationnelle(eauOperationnelle);
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public boolean isEauOperationnelle() {
        return eauOperationnelle;
    }

    public void setEauOperationnelle(boolean eauOperationnelle) {
        this.eauOperationnelle = eauOperationnelle;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PompeAGravitation{");
        sb.append(super.toString());
        sb.append("debit=").append(debit);
        sb.append(", eauOperationnelle=").append(eauOperationnelle);
        sb.append('}');
        return sb.toString();
    }
}
