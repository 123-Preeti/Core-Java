public class A {

}

class B extends Gen8{

}
class C extends B{

}

class Algo<T extends A> {

}

class Gen8{
    public static void processOne(Algo<?> obj) {
        
    }
}
