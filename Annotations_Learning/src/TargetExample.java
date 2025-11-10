import java.lang.annotation.*;
import java.lang.*;



//@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,  ElementType.METHOD})
@interface MyAnno6 {
    String str() default "Default Value of str" ;
}


@MyAnno6(str = "This is @Target class.")
public class TargetExample {

    public static void sayHello() {
        System.out.println("Hello Target");
    }
}
