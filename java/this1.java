class this1 {
   private int a;
   public int getA(){
    return a;
   } 
   public void setA(int a){
    this.a = a;
   }

   public static void main(String[] args) {
       this1 obj1 = new this1();
       obj1.getA();
       obj1.setA(2);
   }
}

