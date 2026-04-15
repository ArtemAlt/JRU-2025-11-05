package strategy;

import java.util.function.Supplier;

public enum AnimalSpecifies {
    DOG("Собака", EatMeatStrategy::new, BarkStrategy::new, RunStrategy::new),
    EAGLE("Орел", EatMeatStrategy::new, TwitSoundStrategy::new, FlyStrategy::new);

    private final String name;
    private final Supplier<EatStrategy> eatMeatStrategy;
    private final Supplier<SoundStrategy> barkStrategy;
    private final Supplier<MoveStrategy> moveStrategySupplier;

    AnimalSpecifies(String name, Supplier<EatStrategy> eatMeatStrategy,
                    Supplier<SoundStrategy> barkStrategy, Supplier<MoveStrategy> moveStrategySupplier) {
        this.name = name;
        this.eatMeatStrategy = eatMeatStrategy;
        this.barkStrategy = barkStrategy;
        this.moveStrategySupplier = moveStrategySupplier;
    }

    public Animal createAnimal(String name){
        return new ConfigurableAnimal(name, this);
    }

    public String getName() {
        return name;
    }

    public Supplier<EatStrategy> getEatMeatStrategy() {
        return eatMeatStrategy;
    }

    public Supplier<SoundStrategy> getBarkStrategy() {
        return barkStrategy;
    }

    public Supplier<MoveStrategy> getMoveStrategySupplier() {
        return moveStrategySupplier;
    }
}
