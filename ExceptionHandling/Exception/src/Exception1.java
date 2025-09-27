class Exception1 {
    public static void main(String[] args) {
        int a =10, b =0, c = 0;
        try {
            c = a / b;
        }
        catch(ArithmeticException ae) {
            System.out.println("Division by zero");
            System.out.println(ae.getMessage());
            ae.printStackTrace();
        }
        System.out.println("Result : " + c);
    }
}
//division by 0 result in ArithmeticException
