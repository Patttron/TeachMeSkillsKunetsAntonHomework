package Unit8;

import java.util.concurrent.Callable;

public class NumberCounter implements Callable<Integer> {
    private int[] array;
    private final int from;
    private final int to;

    public NumberCounter(int[] array, int from, int to) {
        this.array = array;
        this.from = from;
        this.to = to;
    }

    @Override
    public Integer call() throws Exception {
        int counter = 0;
        for (int i = from; i < to; i++) {
            if (array[i] == 1435) {
                counter++;
            }
        }
        return counter;
    }
}