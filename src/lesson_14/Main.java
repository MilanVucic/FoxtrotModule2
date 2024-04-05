package lesson_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class Main {
    private static final ThreadLocal<Integer> variable = ThreadLocal.withInitial(() -> 10);
    private static final int ARRAY_SIZE = 10000000;

    public static void main(String[] args) {
        int[] array = generateRandomArray();
        int numThreads = Runtime.getRuntime().availableProcessors();

        long startTime = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);

        int chunksSize = array.length / numThreads;

        List<Future<Long>> futures = new ArrayList<>();

        // 100 -> 100/8 = 12
        // numThread = 8
        // 0 - 1/8
        // 1/8 - 2/8
        for (int i = 0; i < numThreads; i++) {
            int end;
            if (i != numThreads - 1) {
                end = (i + 1) * chunksSize;
            } else {
                end = array.length;
            }
            int start = i * chunksSize;
            ArraySum arraySum = new ArraySum(array, start, end);

            futures.add(executorService.submit(arraySum));
        }

        long sum = 0;
        for (Future<Long> future : futures) {
            try {
                sum += future.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Total sum :" + sum);
        long endTime = System.currentTimeMillis();

        System.out.println("Time taken:" + (endTime - startTime) + "ms");

        long startTimeNoThreads = System.currentTimeMillis();
        long sumNew = 0;
        for (int i = 0; i < array.length; i++) {
            sumNew += array[i];
        }
        long endTimeNoThreads = System.currentTimeMillis();
        System.out.println("Total sum :" + sumNew);
        System.out.println("Time taken (no threads):" + (endTimeNoThreads - startTimeNoThreads) + "ms");
    }

    private static int[] generateRandomArray() {
        int[] arr = new int[ARRAY_SIZE];
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }

    private static void threadLocalExample() {
        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " : " + variable.get());
            variable.set(20);
            System.out.println(Thread.currentThread().getName() + " : " + variable.get());
        }, "T1");
        Thread t2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " : " + variable.get());
            variable.set(50);
            System.out.println(Thread.currentThread().getName() + " : " + variable.get());
        }, "T2");
        t1.start();
        t2.start();
    }

    private static void executorExample() {
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println(cores);
        try (ScheduledExecutorService executorService = Executors.newScheduledThreadPool(cores)) {
            ScheduledFuture<Integer> future = executorService.schedule(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    return 5;
                }
            }, 3, TimeUnit.SECONDS);

            Integer result = future.get();
            System.out.println(result);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
