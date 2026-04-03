package config;

public enum ConfigKey {
// ========== ОСНОВНЫЕ НАСТРОЙКИ ==========
    /** Ширина сетки города */
    GRID_WIDTH("grid.width", ValueType.INT, 1, 200),
    /** Высота сетки города */
    GRID_HEIGHT("grid.height", ValueType.INT, 1, 100),
    /** Длительность такта в мс */
    SIMULATION_TICK_MS("simulation.tick.ms", ValueType.INT, 100, 5000),
    /** Начальное население */
    SIMULATION_INITIAL_POPULATION("simulation.initial.population", ValueType.INT, 1, 10000),
    /** Размер пула потоков */
    SIMULATION_THREAD_POOL_SIZE("simulation.thread.pool.size", ValueType.INT, 1, 32),

    // ========== ВИРУС ==========
    VIRUS_TYPE("virus.type", ValueType.STRING),
    VIRUS_BASE_INFECTION_RATE("virus.base.infection.rate", ValueType.DOUBLE, 0.0, 1.0),
    VIRUS_BASE_LETHALITY("virus.base.lethality", ValueType.DOUBLE, 0.0, 1.0),
    VIRUS_INCUBATION_DAYS("virus.incubation.days", ValueType.INT, 1, 30),
    VIRUS_IMMUNITY_CHANCE("virus.immunity.chance", ValueType.DOUBLE, 0.0, 1.0),

    // ========== УЯЗВИМОСТЬ ==========
    HUMAN_VULNERABLE_CHILD_RATIO("human.vulnerable.child.ratio", ValueType.DOUBLE, 0.0, 1.0),
    HUMAN_VULNERABLE_CHILD_MORTALITY("human.vulnerable.child.mortality", ValueType.DOUBLE, 0.0, 1.0),
    HUMAN_VULNERABLE_CHILD_INFECTION("human.vulnerable.child.infection", ValueType.DOUBLE, 0.0, 1.0),
    HUMAN_VULNERABLE_ADULT_RATIO("human.vulnerable.adult.ratio", ValueType.DOUBLE, 0.0, 1.0),
    HUMAN_VULNERABLE_ADULT_MORTALITY("human.vulnerable.adult.mortality", ValueType.DOUBLE, 0.0, 1.0),
    HUMAN_VULNERABLE_ADULT_INFECTION("human.vulnerable.adult.infection", ValueType.DOUBLE, 0.0, 1.0),
    HUMAN_VULNERABLE_ELDER_RATIO("human.vulnerable.elder.ratio", ValueType.DOUBLE, 0.0, 1.0),
    HUMAN_VULNERABLE_ELDER_MORTALITY("human.vulnerable.elder.mortality", ValueType.DOUBLE, 0.0, 1.0),
    HUMAN_VULNERABLE_ELDER_INFECTION("human.vulnerable.elder.infection", ValueType.DOUBLE, 0.0, 1.0),
    HUMAN_VULNERABLE_MEDIC_RATIO("human.vulnerable.medic.ratio", ValueType.DOUBLE, 0.0, 1.0),
    HUMAN_VULNERABLE_MEDIC_MORTALITY("human.vulnerable.medic.mortality", ValueType.DOUBLE, 0.0, 1.0),
    HUMAN_VULNERABLE_MEDIC_INFECTION("human.vulnerable.medic.infection", ValueType.DOUBLE, 0.0, 1.0),
    HUMAN_VULNERABLE_MEDIC_IMMUNITY("human.vulnerable.medic.immunity", ValueType.DOUBLE, 0.0, 1.0),

    // ========== ПОВЕДЕНИЕ ==========
    HUMAN_BEHAVIOR_ACTIVE_RATIO("human.behavior.active.ratio", ValueType.DOUBLE, 0.0, 1.0),
    HUMAN_BEHAVIOR_ACTIVE_MOVE("human.behavior.active.move", ValueType.DOUBLE, 0.0, 2.0),
    HUMAN_BEHAVIOR_ACTIVE_CONTACT("human.behavior.active.contact", ValueType.DOUBLE, 0.0, 1.0),
    HUMAN_BEHAVIOR_NORMAL_RATIO("human.behavior.normal.ratio", ValueType.DOUBLE, 0.0, 1.0),
    HUMAN_BEHAVIOR_NORMAL_MOVE("human.behavior.normal.move", ValueType.DOUBLE, 0.0, 2.0),
    HUMAN_BEHAVIOR_NORMAL_CONTACT("human.behavior.normal.contact", ValueType.DOUBLE, 0.0, 1.0),
    HUMAN_BEHAVIOR_ISOLATOR_RATIO("human.behavior.isolator.ratio", ValueType.DOUBLE, 0.0, 1.0),
    HUMAN_BEHAVIOR_ISOLATOR_MOVE("human.behavior.isolator.move", ValueType.DOUBLE, 0.0, 2.0),
    HUMAN_BEHAVIOR_ISOLATOR_CONTACT("human.behavior.isolator.contact", ValueType.DOUBLE, 0.0, 1.0),
    HUMAN_BEHAVIOR_CARRIER_RATIO("human.behavior.carrier.ratio", ValueType.DOUBLE, 0.0, 1.0),
    HUMAN_BEHAVIOR_CARRIER_MOVE("human.behavior.carrier.move", ValueType.DOUBLE, 0.0, 2.0),
    HUMAN_BEHAVIOR_CARRIER_CONTACT("human.behavior.carrier.contact", ValueType.DOUBLE, 0.0, 1.0),
    HUMAN_BEHAVIOR_CARRIER_INCUBATION_INFECTION("human.behavior.carrier.incubation.infection", ValueType.DOUBLE, 0.0, 1.0),

    // ========== МОДИФИКАТОРЫ ==========
    HUMAN_MODIFIERS_SICK_MOVE("human.modifiers.sick.move", ValueType.DOUBLE, 0.0, 1.0),
    HUMAN_MODIFIERS_SICK_CONTACT("human.modifiers.sick.contact", ValueType.DOUBLE, 0.0, 1.0),

    // ========== ЗОНЫ ПЛОТНОСТИ ==========
    DENSE_ZONES_COUNT("dense.zones.count", ValueType.INT, 0, 50),
    DENSE_ZONES_RADIUS("dense.zones.radius", ValueType.INT, 1, 10),
    DENSE_ZONES_MODIFIER("dense.zones.modifier", ValueType.DOUBLE, 1.0, 5.0),
    DENSE_ZONES_BASE_MODIFIER("dense.zones.base.modifier", ValueType.DOUBLE, 0.0, 0.5),

    // ========== ЗАРАЖЕНИЕ ==========
    INFECTION_RECOVERY_CHANCE("infection.recovery.chance", ValueType.DOUBLE, 0.0, 1.0),

    // ========== ВИЗУАЛИЗАЦИЯ ==========
    VISUAL_CELL_SIZE("visual.cell.size", ValueType.INT, 10, 50),
    VISUAL_UPDATE_DELAY_MS("visual.update.delay.ms", ValueType.INT, 100, 2000),

    // ========== ЦВЕТА ==========
    COLOR_HEALTHY("color.healthy", ValueType.COLOR),
    COLOR_INCUBATING("color.incubating", ValueType.COLOR),
    COLOR_SICK("color.sick", ValueType.COLOR),
    COLOR_DEAD("color.dead", ValueType.COLOR),
    COLOR_RECOVERED("color.recovered", ValueType.COLOR),
    COLOR_MEDIC("color.medic", ValueType.COLOR),
    COLOR_DENSE_ZONE_OVERLAY("color.dense.zone.overlay", ValueType.COLOR_ALPHA),
    COLOR_GRID_LINES("color.grid.lines", ValueType.COLOR),
    COLOR_BACKGROUND("color.background", ValueType.COLOR),

    // ========== УСЛОВИЯ ОСТАНОВКИ ==========
    STOP_WHEN_ALL_HEALTHY("stop.when.all.healthy", ValueType.BOOLEAN),
    STOP_WHEN_ALL_DEAD_OR_RECOVERED("stop.when.all.dead.or.recovered", ValueType.BOOLEAN),
    MIN_ALIVE_TO_CONTINUE("min.alive.to.continue", ValueType.INT, 0, 1000);

    private final String key;
    private final ValueType type;
    private final Integer intMin;
    private final Integer intMax;
    private final Double doubleMin;
    private final Double doubleMax;

    ConfigKey(final String key, final ValueType type, final Integer intMin, final Integer intMax){
        this.key = key;
        this.type = type;
        this.intMin = intMin;
        this.intMax = intMax;
        this.doubleMin = null;
        this.doubleMax = null;
    }

    ConfigKey(final String key, final ValueType type, final Double doubleMin, final Double doubleMax){
        this.key = key;
        this.type = type;
        this.doubleMin = doubleMin;
        this.doubleMax = doubleMax;
        this.intMin = null;
        this.intMax = null;
    }

    ConfigKey(final String key, final ValueType type){
        this.key = key;
        this.type = type;
        this.doubleMax = null;
        this.intMin = null;
        this.intMax = null;
        this.doubleMin = null;
    }

    public String getKey() {
        return key;
    }

    public ValueType getType() {
        return type;
    }

    public Integer getIntMin() {
        return intMin;
    }

    public Integer getIntMax() {
        return intMax;
    }

    public Double getDoubleMin() {
        return doubleMin;
    }

    public Double getDoubleMax() {
        return doubleMax;
    }

    public enum ValueType {
        INT, DOUBLE, STRING, BOOLEAN, COLOR, COLOR_ALPHA
    }
}
