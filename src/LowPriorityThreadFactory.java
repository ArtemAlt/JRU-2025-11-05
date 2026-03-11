import java.util.concurrent.ThreadFactory;

public class LowPriorityThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setName("LowPriorityThreadFactoryThread");
        t.setPriority(Thread.MIN_PRIORITY);
        t.setDaemon(false);
        System.out.println("LowPriorityThreadFactory created thread " + t.getName() + " with priority " + t.getPriority());
        return t;
    }
}
