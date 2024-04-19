package lesson_18;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Stringifier {
    boolean showClassName() default true;
    boolean showFieldNames() default true;
    String separator() default " ";
}
