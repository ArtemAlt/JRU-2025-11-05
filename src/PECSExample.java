import java.util.List;

public class PECSExample {

    public static <T> void copy(List<? extends T> source,
                                List<? super T> target) {
        for (T value : source) {
            target.add(value);
        }
    }
}
