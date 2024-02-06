package lesson_1;

import lesson_1.poly_example.BaseClass;
import lesson_1.poly_example.ChildClass1;
import lesson_1.poly_example.ChildClass2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BaseClass a = new BaseClass();
        BaseClass b = new ChildClass1();
        Object c = new ChildClass1();

        System.out.println(a instanceof  ChildClass1); // false
        System.out.println(b instanceof  BaseClass); // true
        System.out.println(b instanceof  ChildClass1); // true
        System.out.println("b" instanceof  Object); // true
        System.out.println(c instanceof  BaseClass); // true
        System.out.println(c instanceof  ChildClass1); // true
    }

    private static void example() {
        List<BaseClass> stuff = new ArrayList<>();
        Object c = new ChildClass1();
        if (c instanceof ChildClass1) {
            ChildClass1 b = (ChildClass1) c;
            stuff.add(b);
        }
        stuff.add(new BaseClass());
        stuff.add(new ChildClass2());

        for (BaseClass obj : stuff) {
            obj.doSomething();
        }
    }
}