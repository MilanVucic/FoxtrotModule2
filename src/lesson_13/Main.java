package lesson_13;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Callable<Integer> callable = () -> {
            int a = 50;
            return a * a;
        };
        ExecutorService service = Executors.newCachedThreadPool();
        Future<Integer> future = service.submit(callable);
        try {
            Integer result = future.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    private static void threadPriority() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                System.out.println("T1:" + i);
            }
        });
        t1.setPriority(Thread.MAX_PRIORITY);
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                System.out.println("T2:" + i);
            }
        });
        t2.setPriority(Thread.NORM_PRIORITY);
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                System.out.println("T3:" + i);
            }
        });
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }

    private static void userRepoExample() {
        UserRepo userRepo = new UserRepo(new Callback<>() {
            @Override
            public void onSuccess(List<User> users) {
                // updateUI(users);
                System.out.println(users);
            }

            @Override
            public void onError(String message) {
                System.out.println(message);
            }
        });
        userRepo.start();
    }
}
