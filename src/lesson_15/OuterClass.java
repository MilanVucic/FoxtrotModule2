package lesson_15;

public class OuterClass {

    private static int b = 500;
    private static int c;
    private int a;

    static {
        c = b * b + Math.ceilDiv(b, 100);
    }

    {

    }

    public OuterClass(int a) {
        this.a = a;
    }

    public class InnerNonStaticClass {
        public void doSomething() {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }

    }

    public static class InnerStaticClass {
        public void doSomething() {
            System.out.println(b);
        }
    }
}
