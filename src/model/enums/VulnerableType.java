package model.enums;

import config.SimulationProperties;

public enum VulnerableType {
    CHILD(0),
    ADULT(1),
    ELDER(2),
    MEDIC(3);
    private final int id;

    VulnerableType(int id) {
        this.id = id;
    }

    public double getMortalityMultiplier() {
       switch (this) {
           case CHILD: SimulationProperties.getInstance(); //todo - реализовать поле
           default:
               return 0;
       }
    }
}
