
public class Main {
    public static void main(String[] args) {
//        DayOfWeek sunday = DayOfWeek.SUNDAY;

//        DayOfWeek[] values = DayOfWeek.values();
//        for (DayOfWeek day : values) {
//            System.out.println(day);
//        }

//        DayOfWeek sunday1 = DayOfWeek.valueOf("SUNDAY");
//        System.out.println(sunday1);

//        int ordinal = DayOfWeek.FRIDAY.ordinal();
//
//        String monday = DayOfWeek.MONDAY.name();
//        String monday1 = DayOfWeek.MONDAY.toString();
//
//        System.out.println(monday);
//        System.out.println(monday1);

//        Planet earth = Planet.EARTH;
//        System.out.println(earth.name());
//        System.out.println(earth.getRussianName());
//        System.out.println(earth.getMass());
//        System.out.println(earth.getSurfaceGravity());
//        System.out.println(earth.toString());


//        Planet mars = Planet.findPlanetByRussianNameOrNull("марс");
//        System.out.println(mars);
//
//        Planet mars1 = Planet.findPlanetByRussianNameOrNull("марс1");
//        System.out.println(mars1);

//            DayOfWeek dayOfWeek = DayOfWeek.FRIDAY;
//        System.out.println(dayOfWeek.getDayType());

//        int num = 3;
//
//        System.out.println("Current number - " + num);
//
//        switch (num) {
//            case 1:
//                System.out.println("Case 1");
//                break;
//            case 2:
//                System.out.println("Case 2");
//                break;
//            case 3:
//                System.out.println("Case 3");
//                break;
//            case 4:
//                System.out.println("Case 4");
//                break;
//            default:
//                System.out.println("Case default");
//        }

        Cache cache = Cache.getInstance();
        cache.put("key1", "value1");
        cache.put("key2", true);
        cache.put("key3", 50);
        cache.put("key4", cache);

        System.out.println(cache.getOrNull("key1"));
        System.out.println(cache.getOrNull("key2"));
        System.out.println(cache.getOrNull("key3"));
        System.out.println(cache.getOrNull("key4"));
        System.out.println("======================");
        Cache cache2 = Cache.getInstance();
        System.out.println(cache2.getOrNull("key1"));
        System.out.println(cache2.getOrNull("key2"));
        System.out.println(cache2.getOrNull("key3"));
        System.out.println(cache2.getOrNull("key4"));

    }
}