package Unit8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Unit8 {
    private static final int THREADS = 4;
    private static final int ARRAY_SIZE = 1000000;

    public static void main(String[] args) throws Exception {
        long startCheckingTime = System.currentTimeMillis();
        findNumber(createArray());
        long finishCheckingTime = System.currentTimeMillis();
        long computingTime = finishCheckingTime - startCheckingTime;
        System.out.println("Computing time to find numbers with one stream: " + computingTime + " milliseconds");
        long startCheckingTime2 = System.currentTimeMillis();
        findNumberWithForkJoinPool(createArray());
        long finishCheckingTime2 = System.currentTimeMillis();
        long computingTime2 = finishCheckingTime2 - startCheckingTime2;
        System.out.println("Computing time to find numbers with four stream: " + computingTime2 + " milliseconds");
    }

    public static int[] createArray() {
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + (int) (Math.random() * 15000);
        }
        return array;
    }

    static void findNumber(int[] array) throws Exception {
        ForkJoinPool pool = new ForkJoinPool(1);
        int from = 0;
        int to = array.length;
        NumberCounter task = new NumberCounter(array, from, to);
        ForkJoinTask<Integer> forkJoinTask = pool.submit(task);
        System.out.println("The number 1435 found " + forkJoinTask.get() + " times in the array");

    }

    static void findNumberWithForkJoinPool(int[] array) throws Exception {
        ForkJoinPool pool = new ForkJoinPool(THREADS);
        List<ForkJoinTask<Integer>> list = new ArrayList<>();
        int partSize = array.length / THREADS;
        int from = 0;
        int to = partSize;
        while (to <= array.length) {
            NumberCounter task = new NumberCounter(array, from, to);
            ForkJoinTask<Integer> forkJoinTask = pool.submit(task);
            list.add(forkJoinTask);
            from = to;
            to += partSize;
        }
        int result = 0;
        for (ForkJoinTask<Integer> task : list) {
            result += task.get();
        }
        System.out.println("The number 1435 found " + result + " times in the array");
    }
}
