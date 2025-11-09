import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Pune");

        cities.set(1, "Bangalore");  // Modify element at index 1
        cities.remove(2);            // Remove element at index 2

        System.out.println(cities);
    }
}
