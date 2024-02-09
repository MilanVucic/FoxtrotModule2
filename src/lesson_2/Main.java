package lesson_2;

import lesson_2.shapes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Triangle(new Point2D(0, 0), 5, 6, 7));
        shapes.add(new Triangle(new Point2D(0, 0), 3, 6, 8));
        shapes.add(new Rectangle(new Point2D(0, 0), 5, 6));
        shapes.add(new Rectangle(new Point2D(0, 0), 3, 10));
        shapes.add(new Circle(new Point2D(0, 0), 3));
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

    }

    private static void doStuff(int a, double b) {

    }
    private static void doStuff(double a, int b) {

    }
}
