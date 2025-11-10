import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnno.class)
@interface MyAnno0 {
    String str() default "Testing";
    int val() default 9000;
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnno {
    MyAnno0[] value();
}


public class RepeatAnno {

    @MyAnno0(str= "First annotation", val = -1)
    @MyAnno0(str= "Second anno", val = 100)
    public static void myMeth(String str, int i) {
        RepeatAnno ob = new RepeatAnno();
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);
            Annotation[] annos = m.getAnnotationsByType(MyAnno.class);
            for(Annotation a : annos)
                System.out.println(a);
        } catch (NoSuchMethodException exc){
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeth("test", 10);
    }
}
