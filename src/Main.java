import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        System.out.println("===Start======");
//
//        SomeClass k1 = new SomeClass("Name_1", "Second_name_1");
//        SomeClass k2 = new SomeClass("Name_2", "Second_name_2");
//
//        System.out.println("====Create instances========");
//
//        System.out.println(k1.toString());
//        System.out.println(k2.toString());
//        System.out.println("===End======");
//        SomeClass k3 = new SomeClass("Name_3", "Second_name_3");
//        System.out.println(k3.toString());

//        SomeClass k1 = new SomeClass("1","2");
//        SomeClass.InnerClass innerClass = k1.new InnerClass("3");

//        Computer c1 = new Computer.Builder()
//                .processor("processor")
//                .cpu(100)
//                .memory(10)
//                .model("model")
//                .build();

//        Computer.Builder cBuilder = new Computer.Builder().model("model").cpu(1000);
        /*
        Count memory and proc
         */
//        Computer c2 = cBuilder.memory(1000).processor("processor").build();
//        MYApp.strt();

        List<String> strings = Arrays.asList("c1", "c2", "c3", "c4", "c5", "c6", "c7");
//        MyComparator comparator = new MyComparator();

        Comparator comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        Collections.sort(strings, comparator);

    }
}