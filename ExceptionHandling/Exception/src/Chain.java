public class Chain {
    static void demoMethod() {
        NullPointerException e = new NullPointerException("Top layer");
        e.initCause(new ArithmeticException("Cause"));
    }

    public static void main(String[] args) {
        try {
            demoMethod();
        }
        catch(NullPointerException ne) {
            System.out.println("Caught : " + ne);
            System.out.println("Original Cause :" + ne.getCause());
        }
    }
}
