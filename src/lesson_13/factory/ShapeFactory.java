package lesson_13.factory;

public class ShapeFactory {
    public static Shape getShape() {
        return new Rectangle();
    }
}
