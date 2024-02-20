package lesson_4.stuff;

public class MaterialCube implements HasWeight{
    private double length;
    private Material material;
    private String color;

    public MaterialCube(double length, Material material, String color) {
        this.length = length;
        this.material = material;
        this.color = color;
    }

    @Override
    public double getWeight() {
        return getVolume() * material.getDensity();
    }

    private double getVolume() {
        return length * length * length;
    }
}
