public class Counter {
    private int counter = 0;

    public void increment() {// A B
        // предусловия       // A(100) B(110)
        synchronized (this) { // А - B wait
            counter++; // А (1000)
        }
        //A(0)
    }

//    public static synchronized incr() {
//        Counter.class
//    }

    public int getCounter() {
        return counter;
    }
}
