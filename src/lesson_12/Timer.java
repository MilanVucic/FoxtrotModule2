package lesson_12;

public class Timer extends Thread{
    private int time;
    private TimerCallback timerCallback;

    public Timer(int time, TimerCallback timerCallback) {
        this.time = time;
        this.timerCallback = timerCallback;
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            if (time == 0) {
                timerCallback.finished();
                break;
            }
            timerCallback.onTick(time);
            time--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
