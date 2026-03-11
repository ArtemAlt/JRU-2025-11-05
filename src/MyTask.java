import java.util.concurrent.Callable;

public class MyTask implements Callable<String> {
    private int duration;
    private int number;

    public MyTask(int number, int duration) {
        this.duration = duration;
        this.number = number;
    }

    @Override
    public String call() throws Exception {
        String name = Thread.currentThread().getName();
        System.out.println("MyTask " + number + " run in thread " + name);
        Thread.sleep(duration);
        System.out.println("My task "+ number + " finished in tread" + name);
        return "OK " + number;
    }
}
