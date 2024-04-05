package lesson_14;

import java.util.concurrent.Callable;

public class ArraySum implements Callable<Long> {
    private int[] array;
    private int start;
    private int end;

    public ArraySum(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    public Long call() throws Exception {
        long sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        return sum;
    }
}
