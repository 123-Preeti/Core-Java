import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno1 {
    String str();
    int val();
}


public class AnnotationExample2 {
    @MyAnno1(str = "Two Parameters", val = 19)
    public static void myMeth(String str, int i) {
        AnnotationExample2 obj = new AnnotationExample2();
        try {
            Class<?> c = obj.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);
            MyAnno1 anno = m.getAnnotation(MyAnno1.class);
            System.out.println("annostring " + anno.str() +
            " \nanno int :" + anno.val());

        } catch(NoSuchMethodException exc) {
            System.out.println("Method Not found");
        }
    }

    public static void main(String[] args) {
        myMeth("test", 10);
    }

}
