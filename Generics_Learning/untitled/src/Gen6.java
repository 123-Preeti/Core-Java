

interface MyInterface<T> {
    void sayMessage(T t);
}
class Gen6 implements MyInterface<String> {
    public void sayMessage(String t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        Gen6 obj = new Gen6();
        obj.sayMessage("Hello world");
    }
}
