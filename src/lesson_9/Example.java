package lesson_9;

public class Example implements Cloneable {
    private int a;

    public Example(int a) {
        this.a = a;
    }

    private void printStuff() {
        System.out.println("Hello from a private method");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Example example) {
            return example.a == this.a;
        }
        return false;
    }

    @Override
    public String toString() {
        return getClass().getName() + " " + hashCode() + ":" + a;
    }
}
