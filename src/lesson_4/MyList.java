package lesson_4;

public interface MyList<T> {
    void add(T element);

    void add(T element, int index);

    T get(int index);

    void remove(int index);

    int size();
}
