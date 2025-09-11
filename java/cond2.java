import java.util.Scanner;
class cond2 {
    public static void main(String[] args) {
        char c;
        Scanner sc = new Scanner(System.in);
        c = sc.nextLine().charAt(0);
        switch(c) {
            case 'a': System.out.println("vowel a");
            break;
            case 'e': System.out.println("vowel e");
            break;
            case 'i':System.out.println("vowel i");
            break;
            case 'o': System.out.println("vowel o");
            break;
            case 'u': System.out.println("vowel u");
            break;
            default: System.out.println("consonant");
        }
    }
}
