package lesson_18;

import java.lang.reflect.Field;

public class StringifierUtil {
    public static String stringify(Object object) {
        Class<?> clazz = object.getClass();
        StringBuilder sb = new StringBuilder();

        if (clazz.isAnnotationPresent(Stringifier.class)) {
            Stringifier stringifier = clazz.getAnnotation(Stringifier.class);
            String sep = stringifier.separator();
            if (stringifier.showClassName()) {
                sb.append(clazz.getSimpleName()).append(sep);
            }
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                if (field.isAnnotationPresent(StringifierIgnore.class)) {
                    continue;
                }
                field.setAccessible(true);
                if (stringifier.showFieldNames()) {
                    String name = field.getName();
                    if (field.isAnnotationPresent(StringifierFieldName.class)) {
                        name = field.getAnnotation(StringifierFieldName.class).value();
                    }
                    sb.append(name).append("=");
                }
                try {
                    sb.append(field.get(object)).append(sep);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        } else {
            throw new IllegalArgumentException("Cannot use on a class without @Stringifier");
        }
        return sb.toString();
    }
}
