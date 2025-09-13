//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;  // Reflection for fetching Method in class
import java.lang.annotation.*; // for Retention and RetentionPolicy

@Retention(RetentionPolicy.RUNTIME)// because we need to execute it on RUNTIME , default will be Class
@interface MyAnno {
    String str();
    int val();
}

class AnnotationExample1 {
    @MyAnno(str = "Annotation Example1", val = 100) // method is annotate because we applied annotation before method
    public static void myMeth() {
        AnnotationExample1 obj = new AnnotationExample1();
        try {
            Class<?> c = obj.getClass(); // object of class
            Method m = c.getMethod("myMeth");// fetching method myMeth
            MyAnno anno = m.getAnnotation(MyAnno.class); //fetching annotation, .class is uuid
            System.out.println("Anno string: " + anno.str() + "Anno int: " + anno.val());



        } catch (NoSuchMethodException exc) {
            System.out.println("Method not found");
        }
    }

    public static void main(String args[]) {
        myMeth();
    }
}
