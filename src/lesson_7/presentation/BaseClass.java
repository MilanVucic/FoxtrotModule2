package lesson_7.presentation;

public class BaseClass {
    private int a, b, c;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BaseClass other) {
            return a == other.a && b == other.b && c == other.c;
        }
        return false;
    }
}
