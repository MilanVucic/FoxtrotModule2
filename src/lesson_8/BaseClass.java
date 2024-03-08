package lesson_8;

public class BaseClass {
    public static int CONSTANT = 500;
    static {
        CONSTANT = 100;
    }

    private int c = 500;
    private int a = c - 200;
    private int b = getValue();
    {
        a = 500;
//        b = 100;
    }

    public BaseClass() {
    }

    public int getValue() {
        return a + b + c;
    }


    public int getB() {
        return b;
    }
}
