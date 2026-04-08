package model.enums;

public enum BehaviorType {
    /** Активный - часто перемещается, много контактов */
    ACTIVE(0),
    /** Обычный - стандартное поведение */
    NORMAL(1),
    /** Изоляционист - редко перемещается, мало контактов */
    ISOLATOR(2),
    /** Носитель - часто перемещается, много контактов, заразен в инкубации */
    CARRIER(3);

    public final int index;

    BehaviorType(int index) {
        this.index = index;
    }
}
