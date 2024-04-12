package lesson_16;

import java.io.Serializable;
import java.util.List;

public class Person implements Serializable {
    private String name;
    private int age;
    private LivingLocation location;
    private List<String> phoneNumbers;

}
