@FunctionalInterface
interface MyInterface {
    double getValue();
}

class Lambda1 {
    public static void main(String[] args) {
        MyInterface mi ;
        mi = () -> 123.45;
        System.out.println("A fixed value: " + mi.getValue());

        mi = () -> Math.random() * 100;
        System.out.println("A random value: " + mi.getValue());
        System.out.println("Another random value: " + mi.getValue());
           }
} 