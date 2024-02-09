package lesson_2;

public class FullyImplemented extends HalfwayImplemented{
    public FullyImplemented(int a, double b) {
        super(a, b);
    }

    @Override
    public int abstractMethod2(String param) {
        return 0;
    }
}
