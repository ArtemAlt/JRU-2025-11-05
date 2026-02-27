import sun.java2d.loops.ProcessPath;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Object obj1 = new MyClass();
//        Object obj12 = new MyClass();
//        Object obj2 = "string";
//        Object obj3 = new Thread();

//        obj1.toString(); // строковой представление
//        System.out.println(obj1.toString());
//        obj1.equals(obj2); // сравнение
//
//        System.out.println(obj1.equals(obj12));
//        System.out.println(obj1 == obj12);
//        obj1.hashCode(); // хеш-код
        //obj1.clone();
//        obj1.getClass(); // о классе
//        System.out.println(obj1.getClass());
//        obj1.finalize();
//        obj1.wait(); ожидание на монитор
//        obj1.notify();
//        obj1.notifyAll();

//        Person p1 = new Person("Vasya", 30, "pass");
//        Person p2 = new Person("Vasya", 30, "pass");
//        Person p3 = new Person("Ilya", 28, "pass1");
//
//        Person copy = Person.copy(p1);
//
//        System.out.println(p1 == p2);
//        System.out.println(p1.equals(p2));
//        System.out.println(p1.equals("string"));
//        MyThread myThread = new MyThread();
//        myThread.start();
//        MyRunnable myRunnable = new MyRunnable();
//        myRunnable.run();
//        Runnable myRunnable2 = () -> System.out.println("MyRunnable2 work");
//        myRunnable2.run();
        Counter counter = new Counter();

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.increment();
                }
            });
            threads.add(thread);
            thread.start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("TOTAL - " + counter.getCounter());

    }
}