import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        List strings = new ArrayList();
//        strings.add("Hello");
//        strings.add("World");
//        strings.add(1);
//        strings.add(true);
//
//        for (int i = 0; i < strings.size(); i++) {
//            String s = (String) strings.get(i);
//            System.out.println(s);
//        }

//        List<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add(1);
//        list.add(true);
//        Set<String> set = new HashSet<>(list);
//        Map<String, Integer> map = new HashMap<>();
//        Queue<String> queue = new LinkedList<>();

//        Box<String> box = new Box<>("new string");
//        box.setData("new data");
//        box.setData(new Cat("cat2"));
//        Box<Integer> box2 = new Box<>(1);
//        Box<Boolean> box3 = new Box<>(false);
//        Box<Character> box4 = new Box<>('a');
//        Box<Cat> box5 = new Box<>(new Cat("cat"));

//        Pair<String, String> pair1 = new Pair<>("a", "b");
//        Pair<String, Cat> pair2 = new Pair<>("Barsik", new Cat("Barsik"));
//
//        NumberBox<Integer> integerNumberBox = new NumberBox<>(10);
//
//        NumberBox<Double> doubleNumberBox = new NumberBox<>(10.0);
//        NumberBox<Float> floatNumberBox = new NumberBox<>(10.0f);
//        NumberBox<Long> longNumberBox = new NumberBox<>(10L);
        /*
        List<Integer>
        List<Number>
         */
//
//        List<Animal> animals = new ArrayList<>();
//        animals.add(new Cat("cat", "Cat"));
//        animals.add(new Dog("dog", "Dog"));

//        String dkhfgki = BaseUtil.identity("dkhfgki");
//        System.out.println(dkhfgki);
//
//        Integer i = BaseUtil.identity(4654);
//        System.out.println(i);

        List<String> strings = new ArrayList<String>() {{
            add("asd");
            add("asd");
        }};
        String name = strings.getClass().getName();

        System.out.println(name);

        List<Integer> ints = new ArrayList<Integer>(){{
            add(1);
            add(2);
        }};
        String name1 = ints.getClass().getName();
        System.out.println(name1);



    }

    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
//        animals.add(new Dog("dog", "Dog"));
    }


}