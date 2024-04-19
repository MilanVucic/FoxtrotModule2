package lesson_18;

import java.lang.reflect.Field;

public class RangeValidator {
    public static boolean validateRange(Object object) {
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        boolean valid = true;
        for (Field field : fields) {
            if (field.isAnnotationPresent(Range.class)) {
                Range range = field.getAnnotation(Range.class);
                try {
                    field.setAccessible(true);
                    Object result = field.get(object);
                    double value = 0;
                    if (result instanceof Double) {
                        value = (Double) result;
                    } else if (result instanceof Integer) {
                        value = (Integer) result;
                    } else {
                        throw new IllegalArgumentException("Cannot use @Range on non-number types.");
                    }
                    if (value > range.max() || value < range.min()) {
                        System.out.println("Field " + field.getName() + " not within required range of: "
                                + range.min() + "-" + range.max());
                        valid = false;
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return valid;
    }
}
