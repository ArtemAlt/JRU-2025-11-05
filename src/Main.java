import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    private static ThreadLocal<String> userHolder = new ThreadLocal<>();
    ThreadLocalRandom random = ThreadLocalRandom.current();

    public static void main(String[] args) {
        Thread t1 = new Thread((new UserTask("Thread #1")));
        Thread t2 = new Thread((new UserTask("Thread #2")));
        Thread t3 = new Thread((new UserTask("Thread #3")));
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t1.notify();
            t1.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       Runnable r1 = () -> System.out.println("Hello World");
        /*
            Переменная А = new Переменная()
            Поток 1 () -> ~A
            Поток 2 () -> ~A

            Переменная B ~;
            Поток 1 (~) -> new B
            Поток 2 (~) -> new B

            Поток 1 () -> ~ new C
            Поток 2 (~C) -> C
         */

    }


    public static class UserTask implements Runnable {
        private final String userName;

        public UserTask(String userName) {
            this.userName = userName;
        }

        @Override
        public void run() {
            userHolder.set(userName);
            System.out.println(Thread.currentThread().getName() + " add user name: " + userName);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String newUserName = userHolder.get();
            System.out.println(Thread.currentThread().getName() + " get current user name: " + newUserName);
            userHolder.remove();
        }
    }

}