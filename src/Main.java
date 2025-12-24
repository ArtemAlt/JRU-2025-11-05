import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap<>();

        myMap.put("a", "1");
        myMap.put("b", "2");
        myMap.put("c", "3");
        myMap.put("d", "4");
        myMap.put("e", "5");
        myMap.put("f", "6");

        String value = myMap.get("a");

        myMap.remove("a");

        boolean containsKey = myMap.containsKey("a");

        boolean b = myMap.containsValue("1");
//
//        myMap.size();
//        myMap.isEmpty();
//        myMap.clear();

//        myMap.keySet();
//        myMap.values();

//        Iterator<Map.Entry<String, String>> iterator = myMap.entrySet().iterator();

//        for (Map.Entry<String, String> entry : myMap.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }

//        Map<String, String> map = new TreeMap<>();
//        Map<String, String> map2 = new LinkedHashMap<>();


        Map<List<String>, Integer> map = new HashMap<>();
        List<String> key = Arrays.asList("a","b");
        map.put(key, 10);
        Integer i = map.get(key);
        System.out.println(i);

        key.add("c");
        Integer i1 = map.get(key);
        System.out.println(i1);

        Set<String> set = new HashSet<>();
    }
}