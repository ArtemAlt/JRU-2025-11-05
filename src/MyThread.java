public class MyThread extends Thread {

    public MyThread() {
    }

    @Override
    public void run() {
        System.out.println("MyThread.run");
    }
}
