import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraysCompare {

    public static void compare() {
        int size = 100000;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Заполняем
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        System.out.println("=== Сравнение производительности (n = " + size + ") ===");

        // 1. Доступ по индексу (get middle)
        System.out.println("\n1. Доступ по индексу (get middle):");

        long startTime = System.nanoTime();
        arrayList.get(size/2);
        long arrayListTime = System.nanoTime() - startTime;
        System.out.println("ArrayList: " + arrayListTime + " ns");

        startTime = System.nanoTime();
        linkedList.get(size/2);
        long linkedListTime = System.nanoTime() - startTime;
        System.out.println("LinkedList: " + linkedListTime + " ns");

        // 2. Добавление в начало
        System.out.println("\n2. Добавление в начало:");

        startTime = System.nanoTime();
        arrayList.add(0, -1);
        arrayListTime = System.nanoTime() - startTime;
        System.out.println("ArrayList: " + arrayListTime + " ns");

        startTime = System.nanoTime();
        linkedList.add(0, -1);
        linkedListTime = System.nanoTime() - startTime;
        System.out.println("LinkedList: " + linkedListTime + " ns");

        // 3. Поиск элемента
        System.out.println("\n3. Поиск элемента:");

        startTime = System.nanoTime();
        arrayList.indexOf(size/2);
        arrayListTime = System.nanoTime() - startTime;
        System.out.println("ArrayList.indexOf(): " + arrayListTime + " ns");

        startTime = System.nanoTime();
        linkedList.indexOf(size/2);
        arrayListTime = System.nanoTime() - startTime;
        System.out.println("LinkedList.indexOf(): " + arrayListTime + " ns");

    }
}
