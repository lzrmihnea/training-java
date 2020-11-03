package ro.training.java.c07._1annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// an annotation is an interface with "@"
// in front of the interface declaration
public @interface Educational {

    String intendedFor() default "";

    boolean forProduction();
}
