package strategy;

public class ConfigurableAnimal extends Animal {

    private final AnimalSpecifies specifies;

    public ConfigurableAnimal(String name, AnimalSpecifies specifies) {
        super(name);
        this.specifies = specifies;
        this.moveStrategy = specifies.getMoveStrategySupplier().get();
        this.eatStrategy = specifies.getEatMeatStrategy().get();
        this.moveStrategy = specifies.getMoveStrategySupplier().get();
    }
}
