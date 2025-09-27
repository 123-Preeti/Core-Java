public class Exception3 {
    public static void main(String[] args) {
        int num = 0;
        try{
            num = Integer.parseInt(args[0]);
        }
        finally {
            System.out.println("Square : " + Math.pow(num, 2));
        }
    }
}
