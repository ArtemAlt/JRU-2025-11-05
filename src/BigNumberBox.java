import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BigNumberBox<T extends Number & Comparable<T>> {

    private List<T> list;

    public BigNumberBox() {
        list = new ArrayList<>();
    }

    private T max() {
        return Collections.max(list);
    }

}
