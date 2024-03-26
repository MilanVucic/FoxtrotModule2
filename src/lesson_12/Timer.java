package lesson_12;

public class Timer extends Thread{
    private int time = 30;

    public Timer(int time) {
        this.time = time;
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            System.out.println(time);
            time--;
            if (time == 0) {
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
