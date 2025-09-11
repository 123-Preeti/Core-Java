
interface Vehicle {

    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);

}

class Bicycle implements Vehicle {

    int speed;
    int gear;

    public void changeGear(int newGear) {
        gear = newGear;
    }

    public void speedUp(int increment) {
        
        speed = speed + increment;
    }

    public void applyBrakes(int decrement) {
        speed = speed - decrement ;
    }

    public void printStates() {
        System.out.println("speed:" + speed + " gear: " + gear);

    }
}

class Bike implements Vehicle {

    int speed;
    int gear;

    public void changeGear(int newGear) {
        gear = newGear;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    public void printStates() {
        System.out.println("speed : "+ speed + " gear: "+ gear );
    }
}

class Main {
    public static void main(String[] args) {
        Bicycle b = new Bicycle();

        b.changeGear(2);
        b.speedUp(3);
        b.applyBrakes(1);
        b.printStates();

        Bike bk = new Bike();

        bk.changeGear(5);
        bk.speedUp(3);
        bk.applyBrakes(1);
        bk.printStates();
    }
}

