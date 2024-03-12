package lesson_9;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Example e = new Example(5);
        Class clazz = e.getClass();
        System.out.println(clazz.getSimpleName());
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + " : " + method.getModifiers());
        }
    }

    private static void hashcodeExample() {
        Example b = new Example(5);
        Example a = new Example(5);
        Example c = a;
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        HashSet<Example> set = new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);
        System.out.println(set.size());

        Map<Example, Integer> map = new HashMap<>();
        map.put(a, 10);
        map.put(b, 15);
        System.out.println(map);
    }


}
