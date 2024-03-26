package lesson_12;

public class Main {
    public static void main(String[] args) {
        Object lock = new Object();

        System.out.println("...asd");
        System.out.println("...asd");
        System.out.println("...asd");
        System.out.println("...asd");
        System.out.println("...asd");
        System.out.println("...asd");

        synchronized (lock) {
            System.out.println("...");
        }
    }

    private static void threadsExample() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                System.out.println("T1:" + i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                System.out.println("T2:" + i);
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                System.out.println("T3:" + i);
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
