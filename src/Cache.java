import java.util.HashMap;
import java.util.Map;

public class Cache {
    private Map<String, Object> storage;

    private Cache() {
        storage = new HashMap<>();
    }

    private static class Holder {
        private static Cache instance = new Cache();
    }

    public static Cache getInstance() {
        return Holder.instance;
    }

    public void put(String key, Object value) {
        storage.put(key, value);
    }

    public Object getOrNull(String key) {
        return storage.get(key);
    }

    public void remove(String key) {
        storage.remove(key);
    }
}
