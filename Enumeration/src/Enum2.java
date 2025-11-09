enum Level { LOW, MEDIUM, HIGH }

public class Enum2 {
    public static void main(String[] args) {
        Level l = Level.HIGH;

        switch (l) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }
}
