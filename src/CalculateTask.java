public class CalculateTask<T> implements Runnable {
    private T data;
    private int result;
    private Exception ex;

    public CalculateTask(T data) {
        this.data = data;
    }

    @Override
    public void run() {
        try {
//            result = data * 100;
        } catch (Exception ex) {
            this.ex = ex;
        }
    }

    public int getResult() {
        return result;
    }

    public Exception getException() {
        return ex;
    }
}
