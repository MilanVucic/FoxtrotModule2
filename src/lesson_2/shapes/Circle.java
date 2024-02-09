package lesson_2.shapes;

public class Circle extends Shape{
    private Point2D center;
    private double radius;

    public Circle(String color, Point2D center, double radius) {
        super(color);
        this.center = center;
        this.radius = radius;
    }

    public Circle(Point2D center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public String getName() {
        return super.getName();
    }


    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * radius * Math.PI;
    }
}
