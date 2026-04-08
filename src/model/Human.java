package model;

import model.enums.BehaviorType;
import model.enums.VulnerableType;

public class Human {
    private final int id;
    private final VulnerableType vulnerableType;
    private BehaviorType behaviorType;
    private HealthStatus status;
    private int x, y;
    private boolean hasImmunity;

    public Human(int id, VulnerableType vulnerableType, int x, int y) {
        this.id = id;
        this.vulnerableType = vulnerableType;
        this.behaviorType = randomizeBehavior();
        this.status = HealthStatus.HEALTH;
        this.x = x;
        this.y = y;
        this.hasImmunity = false;
    }

    private BehaviorType randomizeBehavior(){
        return BehaviorType.values()[(int)(Math.random()*BehaviorType.values().length)];
    }

    public enum HealthStatus {
        HEALTH,
        INCUBATION,
        DEAD,
        SICK,
        RECOVERED
    }

}
