package lesson_13;

public interface Callback<T> {
    void onSuccess(T data);
    void onError(String message);
}
