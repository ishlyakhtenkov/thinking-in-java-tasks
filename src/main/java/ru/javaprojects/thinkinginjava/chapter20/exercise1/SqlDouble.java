package ru.javaprojects.thinkinginjava.chapter20.exercise1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SqlDouble {
    String name();
    Constraints constraints() default @Constraints(nonNull = false);
}
