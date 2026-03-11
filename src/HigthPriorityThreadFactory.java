import java.util.concurrent.ThreadFactory;

public class HigthPriorityThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setName("HighPriorityThreadFactoryThread");
        t.setPriority(Thread.MAX_PRIORITY);
        t.setDaemon(false);
        System.out.println("HighPriorityThreadFactory created thread " + t.getName() + " with priority " + t.getPriority());
        return t;
    }
}
