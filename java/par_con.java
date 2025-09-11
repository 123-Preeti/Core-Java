public class par_con {
    int x, y;String n;
    par_con(int a , int b){
        x = a;
        y = b;
        System.out.println(x + " " + y);
    }
    par_con(int e, String name){
        x = e;
        
        System.out.println(x+ " "+ name);
    }
    void show(){
        System.out.println("X is:" + x);
        System.out.println("Y is:" + y);
    }
}

class Pro{
    public static void main(String[] args) {
        
        par_con obj1 = new par_con(2,5);
        par_con obj2 = new par_con(3,"preeti"); 
        obj1.show();
    }
}