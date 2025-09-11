class const1 {
    int a= 0; String name = null;

    const1() {
        System.out.println(a + " "+ name);
    }
    void show(){
        System.out.println(a + " "+ name);
    }

    
}
class B {
    public static void main(String[] args) {
        const1 cs = new const1();
        cs.show();
    }
}
