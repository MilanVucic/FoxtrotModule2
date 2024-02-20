package lesson_4.stuff;

public class Material {
    private String name;
    private double density; // 100kg/m^3

    public Material(String name, double density) {
        this.name = name;
        this.density = density;
    }

    public double getDensity() {
        return density;
    }
}
