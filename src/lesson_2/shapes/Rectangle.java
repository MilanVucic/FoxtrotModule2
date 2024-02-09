package lesson_2.shapes;

public class Rectangle extends Shape {
    private Point2D topLeft;
    private double a, b;

    public Rectangle(String color, Point2D topLeft, double a, double b) {
        super(color);
        this.topLeft = topLeft;
        this.a = a;
        this.b = b;
    }

    public Rectangle(Point2D topLeft, double a, double b) {
        this.topLeft = topLeft;
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getCircumference() {
        return 2 * (a + b);
    }
}
