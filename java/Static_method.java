public class Static_method {
    int a =10;
    static int b = 20;
    public static void main(String[] args) {
        Static_method sm = new Static_method();
        sm.show();
        Static_method.show();
        sm.Disp();
}
    static void show(){
        System.out.println(  b);
    }
    void Disp(){
        System.out.println(a + " " + b);
    }
}
