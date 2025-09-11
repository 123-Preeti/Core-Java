class Computer {
   public void playMusic(){
    System.out.println("Music playing");
}
public String getPen(int cost){
    if (cost >= 10)
    return "Pen";
    else return "Nothing";
}
}

public class method1 {
    public static void main(String[] args) {
        Computer c = new Computer();
        String str = c.getPen(12);
        System.out.println(str);
        c.playMusic();
    }
}
