import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}

class AnnotationExample1 {
    @MyAnno(str = "Annotation Example1", val = 100)
    public static void myMeth() {
        AnnotationExample1 obj = new AnnotationExample1();
        try {
            Class<?> c = obj.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println("Anno string: " + anno.str() + "Anno int: " + anno.val());



        } catch (NoSuchMethodException exc) {
            System.out.println("Method not found");
        }
    }

    public static void main(String args[]) {
        myMeth();
    }
}
