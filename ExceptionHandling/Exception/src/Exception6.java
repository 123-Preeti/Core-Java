public class Exception6 {
//    public static int convert(String s) {
//        int n = 0;
//        try {
//            n = Integer.parseInt(s);
//        } catch (NumberFormatException ne) {
//            System.out.println("Unable to convert");
//        }
//        return n;
//    }

    public static int convert(String s) throws NumberFormatException {
        return Integer.parseInt(s);
    }

    public static void main(String args[]) {
        int num = 0;
        try {
            num = convert(args[0]);
        } catch (NumberFormatException ne) {
            System.out.println("Invalid Format");
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Invalid index");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(" Square : " + Math.pow(num, 3));

    }
}
