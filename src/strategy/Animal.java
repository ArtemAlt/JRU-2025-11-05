package strategy;

public abstract class Animal {
    protected final String name;
    protected MoveStrategy moveStrategy;
    protected SoundStrategy soundStrategy;
    protected EatStrategy eatStrategy;


    protected Animal(String name) {
        this.name = name;
    }

    public void move(){
        System.out.println("Animal " + this.name + " is moving" + moveStrategy.move());
    }

    public void eat(){
        System.out.println("Animal " + this.name + " is eating" + eatStrategy.eat());
    }

    public void makeSound(){
        System.out.println("Animal " + this.name + " is making sound" +  soundStrategy.makeSound());
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }
    public void setSoundStrategy(SoundStrategy soundStrategy) {
        this.soundStrategy = soundStrategy;
    }
    public void setEatStrategy(EatStrategy eatStrategy) {
        this.eatStrategy = eatStrategy;
    }
}
