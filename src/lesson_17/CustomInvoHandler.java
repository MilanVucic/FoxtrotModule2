package lesson_17;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CustomInvoHandler implements InvocationHandler {
    private Object target;

    public CustomInvoHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before calling a method");
        Object result = method.invoke(target, args);
        System.out.println("After calling the method");
        return result;
    }
}
