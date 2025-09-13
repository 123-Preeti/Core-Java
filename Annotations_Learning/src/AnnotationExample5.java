import java.lang.annotation.*;
import java.lang.reflect.*;


@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker { }


public class AnnotationExample5 {

    @MyMarker
    public static void myMeth(){
    AnnotationExample5 ob = new AnnotationExample5();
        try{
            Class <?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            if(m.isAnnotationPresent(MyMarker.class))
                System.out.println("MyMarker is present");

        } catch(NoSuchMethodException exc) {
            System.out.println("Method not found");
        }
    }
    public static void main(String[] args) {
        myMeth();
    }
}
