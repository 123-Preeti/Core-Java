public class A {
}

class B extends Gen8{

}
class C extends B{

}

class Algo<T extends A> {

}

class Gen8{
    public static void processOne(Algo<?> obj) {} // Algo<A>, Algo<B> Algo<c>

    public static void processTwo(Algo<? extends B> obj) {} // Algo<B> Algo<C

    public static void processThree(Algo<? super B> obj) {}// Algo<a> Algo<B>

    public static void main(String[] argsg) {
        Algo<A> objA = new Algo<>();
        Algo<B> objB = new Algo<B>();
        Algo<C> objC = new Algo<C>();

        processOne(objA);
        processOne(objB);
        processOne(objB);

//        processTwo(objA);
        processTwo(objB);
        processTwo(objC);

        processThree(objA);
        processThree(objB);
//        processThree(objC);
    }

}
