package lesson_4.stuff;

public class Runner {
    public static void main(String[] args) {
        Truck truck = new Truck(
                "Mercedes", "T5000", 12000, 40000);

        Material iron = new Material("Iron", 13780);
        Material wood = new Material("Wood", 700);

        MaterialCube materialCube1 = new MaterialCube(1, iron, "#ff00ff");
        MaterialCube materialCube2 = new MaterialCube(2, wood, "#ff77ff");
        Person person = new Person("Milan Vucic", 88.9, 199.2);

        truck.addLoad(person);
        truck.addLoad(materialCube2);
        truck.addLoad(materialCube1);
        truck.addLoad(new Truck("asd", "asd", 500, 1000));
        System.out.println(truck.getWeight());
        truck.addLoad(new MaterialCube(50, iron, "dfasd"));
    }
}
