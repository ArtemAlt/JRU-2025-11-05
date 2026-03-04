import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = Thread.currentThread();
        System.out.println("Starting " + thread.getName());
//        System.out.println("Thread id " + thread.getId());
//        System.out.println("Thread state " + thread.getState());
        // NEW - RUNNABLE - BLOCKED - WAITING - TIMED_WAITING - TERMINATED
//        System.out.println("Thread priority " + thread.getPriority());
//        System.out.println("Is daemon " + thread.isDaemon());
//        System.out.println("Is alive " + thread.isAlive());

//        Thread task = new Thread(() -> {
//            try {
//                System.out.println("Second thread started");
//                Thread.sleep(1000);
//                System.out.println("Second thread finished");
//            } catch (InterruptedException e) {}
//        });
//        System.out.println("Thread state before start " + task.getState());
//        task.start();
//        System.out.println("Thread state after start " + task.getState());
//        Thread.sleep(100);
//        System.out.println("Thread state after sleep " + task.getState());
//        System.out.println("Main thread finished");
//        thread.join();
//        System.out.println("Thread state after join " + task.getState());
//        MyTask task = new MyTask();
//        Thread thread2 = new Thread(task);
//        thread2.start();
//        MyThread myThread = new MyThread();
//        myThread.start();
//        ThreadGroup threadGroup = new ThreadGroup("Worker group");
//        Thread thread1 = new Thread(threadGroup, () -> System.out.println("Task 1"));
//        Thread thread2 = new Thread(threadGroup, () -> System.out.println("Task 2"));
//        thread2.setDaemon(true);
//        thread1.start();
//        thread2.start();
//
//        System.out.println("Active threads " + threadGroup.activeCount());
//        threadGroup.list();
        ExecutorService executor = Executors.newFixedThreadPool(4);
//        Executors.newWorkStealingPool(5); // ForkJoinPool
//        Executors.newSingleThreadExecutor();
        int[] arr = new int[1000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        int partSize = arr.length / 4;
        List<Future<Integer>> futures = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            int start = i * partSize;
            int end = (i == 3) ? arr.length : start + partSize;
            Callable<Integer> maxFinder = new MaxFinder(arr, start, end);
            Future<Integer> submit = executor.submit(maxFinder);
            futures.add(submit);
        }

        int totalMax = Integer.MIN_VALUE;
        for (Future<Integer> future : futures) {
            try {
                int currMax = future.get();
                System.out.println("Current max: " + currMax);
                if (currMax > totalMax) {
                    totalMax = currMax;
                }

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("Total max: " + totalMax);
        executor.shutdown();

        System.out.println("Main thread finished");

    }
}