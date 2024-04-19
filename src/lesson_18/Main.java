package lesson_18;


@ExampleAnnotation(value = 105)
public class Main {
    @Deprecated
    private int a;

    public static void main(String[] args) {
        Person p = new Person("Milan", 12, 45);
        System.out.println(StringifierUtil.stringify(p));
    }

    @Deprecated
    private static void something() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
