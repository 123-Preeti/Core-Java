import java.util.Scanner;
class rectangle {
    private int width;
    private int height;
    public int getWidth(){
        return width;
    }
    public void setWidth(int w){
        width = w;
    }
    public int getHeight(){
       return height;
    }
    public void setHeight(int h){
        h = height;
    }
    public void acceptData(){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter width:");
        width = a.nextInt();
        System.out.println("Enter height:");
        height = a.nextInt();

    }
    public void showData(){
        System.out.println("Width:" + width);
        System.out.println("height:"+ height);
    }
    public int getArea(){
        return width * height;
    }
    public int getPerimeter(){
        return 2 * ( width + height);
    }


    public static void main(String[] args) {
    rectangle r = new rectangle();
        r.acceptData();
        r.showData();
        System.out.println("Area is: " + r.getArea());
        System.out.println("Perimeter is:" + r.getPerimeter());
    }
}
