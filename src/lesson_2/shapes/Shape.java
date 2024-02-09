
package lesson_2.shapes;

public abstract class Shape {
    private static final String DEFAULT_COLOR = "#ff0000";
    private static int NEXT_ID = 1;

    private int id;
    private String color; // #23ff00 (RGB) range from 0-255

    public Shape(String color) {
        this.color = color;
        id = NEXT_ID++;
    }

    public Shape() {
        this(DEFAULT_COLOR);
    }

    public String getColor() {
        return color;
    }

    public int getId() {
        return id;
    }

    protected abstract double getArea();
    public abstract double getCircumference();
    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "ID:" + id + " " + getName() + " Area: " + getArea() + " Circumference:" + getCircumference();
    }
}
