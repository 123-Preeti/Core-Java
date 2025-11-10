import java.lang.annotation.*;


@Target(ElementType.TYPE_USE)
@interface TypeAnno { }



public class TypeAnnoExample {

    public static void myMethod() {

        @TypeAnno String str;
    }

    public @TypeAnno String getMessage() { //annotated method
        String str = new String("Hello World!");
        return str;
    }

    public void sayMessage(@TypeAnno String str) { //annotated method parameter
        System.out.println(str);
    }

    public void sayMessageAgain(String str) throws @TypeAnno Exception {// throws clause
        System.out.println(str);
    }

    public static <@TypeAnno T> void sayMessageOnceAgain(String str) { // with generics
        System.out.println(str);
    }

    public static void main(String[] args) {
        myMethod();
    }

}
