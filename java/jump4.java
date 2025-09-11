public class jump4 {
    public static void main(String[] args) {
        int x,y;
        skip:
        for(x =2; x< 4; x++){
            System.out.println("x =" +x);
            for(y =2; y<6; y++){
                System.out.println("y:" + y);
                if(x == y){
                    continue skip;
                }
            }
        }
    }
}
