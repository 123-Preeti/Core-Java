public class Exception2 {
    public static void main(String[] args) {
        int num = 0;
        try {
            num = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException ne) {
            ne.getMessage();
            System.out.println("Invalid format");
        }

        catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Invalid index");
        }

        catch(Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
        System.out.println("Square : " + Math.pow(num, 2));
    }
}
