
public class Main {
//    private static int counter = 0;
//    private static volatile boolean running = true;

    public static void main(String[] args) throws InterruptedException {
//        Runnable task = () -> {
//            for(int i = 0; i < 1000; i++) {
//                counter++;
//            }
//        };
//        Thread [] threads = new Thread[10];
//        for(int i = 0; i < threads.length; i++) {
//            threads[i] = new Thread(task);
//            threads[i].start();
//        }
//        for (Thread thread : threads) {
//            try {
//                thread.join();
//            } catch (InterruptedException e) {}
//        }
//        System.out.println("Result: " + counter);

//        Thread thread = new Thread(() -> {
//            System.out.println("Thread started");
//            long counter = 0;
//            while (running) {
//                counter++;
//                if (counter % 1000 == 0) {
//                    System.out.println("Thread counter: " + counter);
//                }
//            }
//            System.out.println("Thread finished");
//        });
//        thread.start();
//        System.out.println("Main thread started");
//
//        Thread.sleep(3000);
//        running = false;
//
//        if(thread.isAlive()) {
//            System.out.println("Thread still alive");
//        } else  {
//            System.out.println("Thread dead");
//        }

//        Thread.yield();
        // A - *****
        // B - *****
        // *****|
        //      |*****
        // ***yield|
        //         |*****

//        Thread t =  new Thread(() -> {
//            System.out.println("Hello World");
//        });
//        t.start();
//        t.join();

        BankAccount b1 = new BankAccount(111, 1000);
        BankAccount b2 = new BankAccount(222, 2000);
        BankAccount b3 = new BankAccount(333, 3000);

        BalanceTransfer bt = new BalanceTransfer();

        bt.transfer(b1, b2, 500);
//        bt.transfer(b1, b2, 1000);
        bt.transfer(b2, b3, 1000);
    }
}