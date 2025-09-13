import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Single {
    int value();// if in single interface , we provide name value then we can directly give the value not like , value = 100
}

public class MySingle {

    @Single(100)
    public static void myMeth(){
        MySingle ob = new MySingle();
        try{
            Method m = ob.getClass().getMethod("myMeth");
            Single anno = m.getAnnotation(Single.class);
            System.out.println(anno.value());
        } catch(NoSuchMethodException exc) {
            System.out.println("No method found");
        }

    }
    public static void main(String[] args) {
        myMeth();
    }
}
