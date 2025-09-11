import java.util.Scanner;
class Cond1 {
    public static void main(String[] args) {
       char c;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Character");
       c = sc.nextLine().charAt(0);
       if(c >=65 && c <= 90)
        System.out.println("Upper case");
        else if(c >= 'a' && c <= 'z')
            System.out.println("Lower case");
        else 
            System.out.println("Special");
    }
}
