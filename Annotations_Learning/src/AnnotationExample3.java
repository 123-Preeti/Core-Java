import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.lang.reflect.*;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno2 {
    String str();
    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

@What(description = "An annotation test class")
@MyAnno2(str = "META2", val = 20)

public class AnnotationExample3 {
    @What(description = "An annotation test method")
    @MyAnno2(str = "Testing", val = 100)

    public static void myMethod() {
        AnnotationExample3 obj  = new AnnotationExample3();
        try {
            Annotation annos[] = obj.getClass().getAnnotations();
            System.out.println("All annotation for AnnotationExample3 ");
            for(Annotation a: annos)
                System.out.println(a);
            System.out.println();

            Method m = obj.getClass().getMethod("myMethod");
            annos = m.getAnnotations();
            System.out.println("All annotations for myMethod:");
            for(Annotation a: annos)
                System.out.println(a);

        } catch(NoSuchMethodException exc) {
            System.out.println("NO METHOD FOUND");
        }
    }
    public static void main(String[] args) {
       myMethod();
    }
}

