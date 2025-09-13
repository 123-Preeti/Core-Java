import java.lang.reflect.*;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno4 {
    String str() default "Testing";
    int val() default 9000;
}

public class AnnotationExample4 {

    @MyAnno4()// it will take default values
    public static void myMeth() {
            AnnotationExample4 obj = new AnnotationExample4();
        try {
            Class <?> c = obj.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno4 anno = m.getAnnotation(MyAnno4.class);
            System.out.println("anno string: " + anno.str() + " \nanno value :" + anno.val());
        } catch(NoSuchMethodException exc) {
            System.out.println("NO METHOD FOUND");
        }
    }
    public static void main(String[] args) {
        myMeth();
    }

}
