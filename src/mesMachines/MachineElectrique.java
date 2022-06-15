package mesMachines;

import java.time.LocalDate;

public class MachineElectrique extends Machine{
    private int puissanceW;

    public MachineElectrique() {
    }


    public MachineElectrique(LocalDate dateAchat, String marque, String modele, int puissanceW) {
        super(dateAchat, marque, modele);
        this.setPuissanceW(puissanceW);
    }

    public int getPuissanceW() {
        return puissanceW;
    }
    public void setPuissanceW(int puissanceW) {
        this.puissanceW = puissanceW;
    }

    /**
     * *
     * {@inheritDoc}
     * *
     * @see mesMachines.Machine#toString() */
    @Override
    public String toString() {
        return"(" + puissanceW + "W) " + super.toString();
    }
}
