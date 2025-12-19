import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

//    List<String> arr = new ArrayList<>();
//
//    List<String> arr2 = new LinkedList<>();
//
//    arr.add("a");
//    arr.get(0);
//
//    arr2.get(0);

//        MyLinkedList<Integer> list = new MyLinkedList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.print();
//
//        list.addFirst(10);
//        list.print();

//        ArraysCompare.compare();

//        Set<Integer> arrSet = new HashSet<>();
//        arrSet.add(1);
//        arrSet.add(2);
//        arrSet.add(3);
//        arrSet.add(1);
//        arrSet.add(-1);

//        for (Integer i : arrSet) {
//            System.out.println(i);
//        }

//        Iterator<Integer> iterator = arrSet.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        List<String> list1 = Arrays.asList("хлеб", "молоко", "яйца", "сыр", "масло");
        List<String> list2 = Arrays.asList("молоко", "сыр", "колбаса", "чай", "кофе");

        Set<String> set1 = new HashSet<>(list1);
        Set<String> set2 = new HashSet<>(list2);

        Set<String> commonItems = new HashSet<>(set1);
        commonItems.addAll(set2);

        for (String item : commonItems) {
            System.out.println(item);
        }


    }

}