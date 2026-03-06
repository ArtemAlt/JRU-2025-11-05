import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
    private List<String> list = new ArrayList<>();
    private Map<String, Integer> map = new HashMap<>();

    private final Object listLock = new Object();
    private final Object mapLock = new Object();

    public void addToList(String str) {
        synchronized (listLock) {
            list.add(str);
        }
    }

    public  void addToMap(String str) {
        synchronized (mapLock) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
    }
}
