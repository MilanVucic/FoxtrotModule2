package lesson_12;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer(10, new TimerCallback() {
            @Override
            public void finished() {
                System.out.println("Time has run out...");
            }

            @Override
            public void onTick(int timeRemaining) {
                System.out.println("Time remaining: " + timeRemaining);
            }
        });
        timer.start();
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
