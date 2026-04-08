package model.enums;

public enum VirusType {
    FLU("Грипп", 0.3, 0.02, 5, 0.7),
    COVID("Ковид", 0.7, 0.07, 15, 0.8),
    EBOLA("Эбола", 0.9, 0.5, 7, 0.5)  ;

    public final String name;
    public final double infection;
    public final double lethality;
    public final int incubation;
    public final double immunity;

    VirusType(String name, double infection, double lethality,
              int incubation, double immunity) {
        this.name = name;
        this.infection = infection;
        this.lethality = lethality;
        this.incubation = incubation;
        this.immunity = immunity;
    }
}
