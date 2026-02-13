import java.util.List;

public class Util {

    public static <T> T add(List<T> list, T value) {
        list.add(value);
        return value;
    }
}
