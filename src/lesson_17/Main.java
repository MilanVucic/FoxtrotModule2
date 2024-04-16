package lesson_17;

import java.lang.reflect.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Class<TestCase> testCaseClass = TestCase.class;
        Field[] fields = testCaseClass.getDeclaredFields();
        Method[] methods = testCaseClass.getDeclaredMethods();
        Example e = new ExampleImpl();
        Example example = (Example) Proxy.newProxyInstance(Example.class.getClassLoader(),
                new Class[]{Example.class}, new CustomInvoHandler(e));

        example.doSomething();
    }

    private static void changingPrivateFields(Class<TestCase> testCaseClass) {
        try {
            TestCase testCase = new TestCase();
            Field f = testCaseClass.getDeclaredField("privateField");
            f.setAccessible(true);
            f.set(testCase, 500);
            System.out.println(testCase);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static void constructorExample(Class<TestCase> testCaseClass) {
        try {
            Constructor<TestCase> constructor = testCaseClass.getDeclaredConstructor(boolean.class);
            TestCase testCase = testCaseClass.newInstance();
            constructor.setAccessible(true);
            TestCase testCase1 = constructor.newInstance(true);
            System.out.println(testCase);
            System.out.println(testCase1);
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private static void methodExample(Class<TestCase> testCaseClass, Method[] methods) {
        Method m = methods[0];
        System.out.println(m.getName());
        System.out.println(m.getModifiers());
        System.out.println(Arrays.toString(m.getTypeParameters()));

        try {
            TestCase testCase = new TestCase();
            Method privateMethod = testCaseClass.getDeclaredMethod("aPrivateMethod", int.class);
            System.out.println(privateMethod.getName());
            privateMethod.setAccessible(true);
            privateMethod.invoke(testCase, 3);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static void fieldExample(Class<TestCase> testCaseClass, Field[] fields) {
        Field f = fields[0];
        System.out.println(f.getName());
        System.out.println(f.getDeclaringClass());
        System.out.println(f.getModifiers());
        try {
            Field another = testCaseClass.getField("staticVar");
            System.out.println(another.getName());
            System.out.println(another.getType());
            System.out.println(another.getModifiers());
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}
