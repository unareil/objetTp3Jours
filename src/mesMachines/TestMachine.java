package mesMachines;

import java.time.LocalDate;

public class TestMachine {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(1999,05,15);
        LocalDate date2 = LocalDate.of(2000,4,28);
        LocalDate date3 = LocalDate.of(2018,7,18);
        LocalDate date4 = LocalDate.of(2020,1,4);

        MachineElectrique telephone = new MachineElectrique(date, "Nokia","3310",15);
        System.out.println(telephone);

        BassinADecanter bassin = new BassinADecanter(date2, "bassin","bassin", 500);
        System.out.println(bassin);

        MachineEssence voiture = new MachineEssence(date3, "Volkwsagen", "Golf", 130);
        System.out.println(voiture);

        PompeAGravitation pompe = new PompeAGravitation(date4, "SpaceX", "xDragoon",50,true);
        System.out.println(pompe);

    }
}
