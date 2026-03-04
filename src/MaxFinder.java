import java.util.concurrent.Callable;

public class MaxFinder implements Callable<Integer> {
    private int[] array;
    private int start;
    private int end;

    public MaxFinder(int[] array, int start, int end) {
        this.array = array;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("MaxFinder " + Thread.currentThread().getName() +" starting at [" + start + "] ending at [" + end + "]");
        int max = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            Thread.sleep(10);
        }
        return max;
    }
}
