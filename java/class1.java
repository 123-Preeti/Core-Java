import java.util.Scanner;
class Point{
    private int x;
    private int y;
    public int getX(){
        return x;
    }
    public void setX(int a){
        x = a;
    }
    public int getY(){
        return y;
    }
    public void setY(int a){
        y = a;
    }
    public void acceptData(){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter x");
        x = a.nextInt();
        System.out.println("Enter y:");
        y = a.nextInt();
    }
    public void showData(){
        System.out.println("X:"+x);
        System.out.println("Y:"+y);
    }
    public static void main(String[] args) {
    Point p = new Point();
    p.acceptData();
    p.showData();
    Point p1;
    p1 = new Point();
    p1. setX(10);
    p1.setY(20);
    p1.showData();

    }
}
