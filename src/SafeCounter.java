public class SafeCounter {
    private int counter = 0;
    private final Object lock = new Object();
//    private final String stringLock = "stringLock";

    public synchronized void increment() {
       counter++;
    }

    public void incrementWithLock() {
        synchronized (lock) {
            counter++;
        }
    }

    public void incrementTenThousand() {
        int total = 0 ;
        for (int i = 0; i < 10000; i++) {
            total += i;
        }
        synchronized (lock) {
            counter = total;
        }
    }

    public synchronized int getCounter() {
        return counter;
    }
}
