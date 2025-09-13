public class FirstAnnotation {
    public void sayHello(){
        System.out.println("Hello from base class");

    }
}
class Derived extends FirstAnnotation {

    @Override
    public void sayHello() {
        System.out.println("Hello from derived class");
    }
}
