package lesson_15;

public interface ResultCallback {
    void onSuccess(String result);
    void onError(String error);
}
