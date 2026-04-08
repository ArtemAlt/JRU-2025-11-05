package model;

import config.SimulationProperties;
import model.enums.VirusType;

public class Virus {
    private final VirusType type;
    private final double infectionRate;
    private final double lethality;
    private final int incubationDays;
    private final double immunityChance;

    public Virus (VirusType type) {
        this.type = type;
        SimulationProperties prop = SimulationProperties.getInstance();
        this.infectionRate = prop.VIRUS_BASE_INFECTION_RATE;
        this.lethality = prop.VIRUS_BASE_INFECTION_RATE;
        this.incubationDays = prop.VIRUS_INCUBATION_DAYS;
        this.immunityChance = prop.VIRUS_BASE_INFECTION_RATE;
    }

    public VirusType getType() {
        return type;
    }

    public double getInfectionRate() {
        return infectionRate;
    }

    public double getLethality() {
        return lethality;
    }

    public int getIncubationDays() {
        return incubationDays;
    }

    public double getImmunityChance() {
        return immunityChance;
    }
}
