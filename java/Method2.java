import java.util.Scanner;
public class Method2 {
    int n, n1, add, sub, mul, div;
    Scanner sc = new Scanner(System.in);

    

    public void input(){
        System.out.println("INPUT METHOD  \n Enter first number");
         n = sc.nextInt();
        System.out.println("Enter second number");
         n1 = sc.nextInt();
        System.out.println(n+ "\n"+ n1);
    }
    public void process(){
         add = n + n1;
         sub = n - n1;
         mul = n * n1;
         div = n / n1;
    }

    public void output(){
        System.out.println("OUTPUT METHOD"+add);
        System.out.println(sub);
         System.out.println(mul);
         System.out.println(div);

    }
    
    public void getName(String name){
        String n = name;
        System.out.println("GET METHOD name is:" + n);
    }

    public void setName(){
        String n = "Preeti";
        System.out.println("SET METHOD name is:" + n);
    }

    public static void main(String[] args) {
        Method2 m = new Method2();
        m.input();
        m.process();
        m.output();
        m.getName("HI");
        m.setName();
    }
}
