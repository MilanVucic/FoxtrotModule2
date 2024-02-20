package lesson_4.stuff;

import java.util.ArrayList;
import java.util.List;

public class Truck implements HasWeight {
    private String model;
    private String maker;
    private double weight;
    private double maxTotalWeight;
    private List<HasWeight> truckLoad = new ArrayList<>();

    public Truck(String model, String maker, double weight, double maxTotalWeight) {
        this.model = model;
        this.maker = maker;
        this.weight = weight;
        this.maxTotalWeight = maxTotalWeight;
    }

    public void addLoad(HasWeight item) {
        if (getWeight() + item.getWeight() < maxTotalWeight) {
            truckLoad.add(item);
        } else {
            throw new IllegalArgumentException("Truck is full, cannot add any more items.");
        }
    }

    @Override
    public double getWeight() {
        double loadWeight = 0;
        for (int i = 0; i < truckLoad.size(); i++) {
            loadWeight += truckLoad.get(i).getWeight();
        }
        return weight + loadWeight;
    }
}
