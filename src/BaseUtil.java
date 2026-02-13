import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaseUtil {

    public static <T> T identity(T value) {
        System.out.println(value.getClass().getName());
        return value;
    }

    public static <K, V> Pair <K, V> createPair(K key, V value) {
        System.out.println(value.getClass().getName());
        System.out.println(key.getClass().getName());
        return new Pair<>(key, value);
    }

    public static <T> List<T> arrayToList(T [] arr){
        return new ArrayList<>(Arrays.asList(arr));
    }

//    public static <K, T> List<T> arrayToList1(K [] arr){
//
//    }
//
//    public static<K, T> T transform(K val){
//        if(val instanceof Integer){
//
//        }
//        if(val instanceof Double){
//
//        }
//        if (val instanceof String){
//
//        }
//        if (val instanceof List){
//
//        }
//
//    }
}
