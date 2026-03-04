import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public interface MyEcotouristService extends Executor {
    void shutdown();
    <T> Future<T> submit(Callable<T> task);
    Future<?> submit(Runnable task);

}
