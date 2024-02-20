package lesson_4.stuff;

import lesson_4.ProducesSound;

public class Person implements HasWeight, ProducesSound {
    private String name;
    private double weight;
    private double height;

    public Person(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void makeASound(int volume) {

    }
}
