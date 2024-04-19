package lesson_18;

@Stringifier()
public class Person {
    private String name;
    @Range(min = 0, max = 130)
    @StringifierFieldName("current age")
    private int age;
    @Range(min = 0, max = 300)
    @StringifierIgnore
    private double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
