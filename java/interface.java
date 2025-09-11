interface testInterface {
    final int a = 10;

    void display();
}

class TestClass implements testInterface {
    public void display(){
        System.out.println("Interface");
    }
}

class Test {
    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.display();
        System.out.println(t.a);
    }
}