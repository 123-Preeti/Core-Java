enum Laptop {
    MACBOOK("Apple", 180000),
    DELL("Dell", 85000),
    HP("HP", 70000),
    ASUS("ASUS", 65000);

    private String brand;
    private int price;

    Laptop(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() { return brand; }
    public int getPrice() { return price; }
}

public class Example2 {
    public static void main(String[] args) {
        for (Laptop l : Laptop.values()) {
            System.out.println(l + " = " + l.getBrand() + " : ₹" + l.getPrice());
        }
    }
}
