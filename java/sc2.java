import java.util.Scanner;
public class sc2 {
    public static void main(String[] args) {
        float r , ar , cr;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter radius");
        r = sc.nextFloat();
        System.out.println("area :" + (3.14 * r * r));
        System.out.println("Circumference :" + (2 * 3.14 * r));
    }
}
