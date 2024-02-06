package lesson_1.poly_example;

public class BaseClass {
    public static int a = 100;
    protected static int b = 50;
    static int c = 50;
    private static int d = 2;

    private int age;

    public void doSomething() {
        System.out.println("BaseClass doSomething called.");
    }


    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        this.age = age;
    }
}
