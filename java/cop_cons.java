public class cop_cons {
    int a; String b;
    cop_cons(){
        
    }
    cop_cons(){
        a = 10; b ="preeti";
        System.out.println("\n" + a + " " + b);
    }
    cop_cons(cop_cons ref){
        a = ref.a;
        b = ref.b;
        System.out.println(a + " " + b);
    }

}
class A{
    public static void main(String[] args){
        cop_cons r = new cop_cons();
        cop_cons r1 = new cop_cons(r);
        
    }
}