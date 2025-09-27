public class Exception5 {
    public static void main(String[] args) {
        int num = 0;
        try{
            num = Integer.parseInt(args[0]);

            if(num > 100) {
                Exception4 e = new Exception4("Number too big");
                num = 0;
                throw e;
            }
        }
        catch(NumberFormatException ne) {
            System.out.println("Invalid format");
        }
        catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("Invalid index");
        }
        catch(Exception4 ex) {
            System.out.println(ex.getMsg());
        }
        catch(Exception c) {
            c.printStackTrace();
        }
        System.out.println("Square :" + Math.pow(num, 2));
    }
}
