package lesson_12;

public interface TimerCallback {
    void finished();
    void onTick(int timeRemaining);
}
