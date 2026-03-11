import java.util.concurrent.ThreadFactory;

public class NormalPriorityThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setName("NormalPriorityThreadFactoryThread");
        t.setDaemon(false);
        System.out.println("NormalPriorityThreadFactory created thread " + t.getName() + " with priority " + t.getPriority());
        return t;
    }
}
