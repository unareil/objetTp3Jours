package mesMachines;

import java.time.LocalDate;

public class BassinADecanter extends Machine{
    private int capaciteHL;

    public BassinADecanter() {

    }

    public BassinADecanter(LocalDate dateAchat, String marque, String modele, int capaciteHL) {
        super(dateAchat, marque, modele);
        this.setCapaciteHL(capaciteHL);
    }

    public int getCapaciteHL() {
        return capaciteHL;
    }

    public void setCapaciteHL(int capaciteHL) {
        this.capaciteHL = capaciteHL;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BassinADecanter{");
        sb.append(super.toString());
        sb.append("capaciteHL=").append(capaciteHL);
        sb.append('}');
        return sb.toString();
    }
}
