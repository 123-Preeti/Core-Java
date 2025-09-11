public class Method3 {

    // USER-DEFINED METHOD 
    public void print() {
        System.out.println("Print method");
    }

    //STATIC METHOD 
    static void hello() {
        System.out.println("Hello method");
    }


    public static void main(String[] args) {
        Method3 m = new Method3();
        m.print(); //calling user defined method 
        Method3.hello(); //calling static method
    }
}