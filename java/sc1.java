import java.util.Scanner;

public class input {
    public static void main(String args[]) {
        // print name add
        String name, address;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        name = sc.nextLine();
        System.out.println("Enter address");
        address = sc.nextLine();
        System.out.println("Enter age");
        int age = sc.nextInt();

        System.out.println("Hii " + name + "\nyou lives in " + address + "\n your age is : " + age);
        sc.close();

    }
}

