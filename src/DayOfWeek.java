public enum DayOfWeek {
    MONDAY("Понедельник", false),
    TUESDAY("Вторник", false),
    WEDNESDAY("Среда", false),
    THURSDAY("Четверг", false),
    FRIDAY("Пятница", false),
    SATURDAY("Суббота", true),
    SUNDAY("Воскресенье", true);

    private final String russianName;
    private final boolean isWeekend;

    DayOfWeek(String russianName, boolean isWeekend) {
        this.russianName = russianName;
        this.isWeekend = isWeekend;
    }
/*
    swith(*) {
        case * :
        case * :
        case * :
        case * :
        default:
    }
 */

    public String getDayType() {
        switch (this) {
            case MONDAY: return "Начало рабочей недели";
            case TUESDAY: case WEDNESDAY: case THURSDAY: return "Обычный рабочий день";
            case FRIDAY:
                return "Последний рабочий день недели";
            case SATURDAY:
            case SUNDAY:
                return "Выходной день";
            default:
                return "Неизвестный день";
        }
    }
}
