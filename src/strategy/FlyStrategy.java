package strategy;

public class FlyStrategy implements MoveStrategy {
    @Override
    public String move() {
        return "fly";
    }
}
