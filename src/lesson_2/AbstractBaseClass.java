package lesson_2;

public abstract class AbstractBaseClass {
    private int a;
    private double b;

    public AbstractBaseClass(int a, double b) {
        this.a = a;
        this.b = b;
    }

    public void doStuff() {
        System.out.println("Doing stuff");
    }

    public abstract void abstractMethod();
    public abstract int abstractMethod2(String param);
}
