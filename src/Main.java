import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

public class Main {
    public static void main(String[] args) {
//        ThreadGroup parent = new ThreadGroup("Родитель");
//        ThreadGroup child = new ThreadGroup(parent,"Потомок");

//        while (child.getParent() != null) {
//            System.out.println("Parent: " +  child.getParent());
//            child = child.getParent();
//        }
//        parent.getName();
//        parent.getParent();
//        parent.interrupt();
//        parent.isDaemon();
//        parent.setDaemon(false);
//        parent.activeCount();
//        parent.list();
//
//        String name = Thread.currentThread().getThreadGroup().getName();
//        System.out.println(name);

        /*
         readAllByte(String filePath) {
         int fileSize = getSize(filePath);
         100 кб -> 10 * 10 кБ
         for(int i; i < fileSize /1000; I++) {
          new Thread -> read (N + buffer);
         }
         close();
         join()
         */


//        WordDocumentCreator wordDocumentCreator = new WordDocumentCreator();
//        Document word = wordDocumentCreator.createDocument("word");

//        LowPriorityThreadFactory lowPriorityThreadFactory = new LowPriorityThreadFactory();
//        NormalPriorityThreadFactory normalPriorityThreadFactory = new NormalPriorityThreadFactory();
//        HigthPriorityThreadFactory higthPriorityThreadFactory = new HigthPriorityThreadFactory();
//
//        Runnable task = () -> {
//            Thread currentThread = Thread.currentThread();
//            System.out.println("Task run in " + currentThread.getName() + " with priority " + currentThread.getPriority());
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        };
//        Thread thread1 = lowPriorityThreadFactory.newThread(task);
//        Thread thread2 = normalPriorityThreadFactory.newThread(task);
//        Thread thread3 = higthPriorityThreadFactory.newThread(task);
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
//
//        thread1.join();
//        thread2.join();
//        thread3.join();
//        System.out.println("All threads finished");

        ExecutorService es = Executors.newFixedThreadPool(6);
//        Executors.newCachedThreadPool();
//        Executors.newSingleThreadExecutor();
//        Executors.newScheduledThreadPool(4);// cron
//        Executors.newWorkStealingPool(); // ForkJoinPool
        System.out.println("START");
        List<Future<String>> futures = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            MyTask myTask = new MyTask(i, 100*i);
            futures.add(es.submit(myTask));
        }
        System.out.println("COMPLETE");
        for (Future<String> future : futures) {
            if (future.isDone()) {
                try {
                    System.err.println(future.get());
                } catch (InterruptedException | ExecutionException e) {
                    System.out.println(e.getMessage());
                    es.shutdownNow();
                }
            }
        }
        es.shutdown();
        System.out.println("END");
        // * * * * *
        // 1, 15 * * * *
        // 10-15 * * * *
        // */5 * * * *
        // 0 0 * * 3
        //0 12 * * 3
    }
}