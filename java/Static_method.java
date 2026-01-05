public class Static_method {
    int a =10;
    static int b = 20;
    public static void main(String[] args) {
        Static_method sm = new Static_method();
        sm.show();
        Static_method.show();
        sm.Disp();
}
    static void show(){
        System.out.println(  b);
    }
    void Disp(){
        System.out.println(a + " " + b);
    }
}




✅ Static Method in Java – Important Points
🔹 What is a Static Method?

A static method belongs to the class, not to objects

Declared using the static keyword

static void show() {
    System.out.println("Hello");
}

🔹 How to Call a Static Method?

Called using class name

No object creation needed

ClassName.methodName();

🔹 Key Characteristics ⭐

Belongs to the class

Memory allocated only once

Can be called directly from static context

Faster access than instance methods

Commonly used for utility methods

🔹 Rules of Static Method (Very Important ⭐⭐)

❌ Cannot use this or super

❌ Cannot access non-static variables/methods directly

✅ Can access only static members

✅ Can be overloaded

❌ Cannot be overridden (method hiding occurs)

🔹 Example
class Test {
    static void display() {
        System.out.println("Static Method");
    }

    public static void main(String[] args) {
        Test.display();
    }
}

🔹 Static Method vs Instance Method
Feature	Static Method	Instance Method
Belongs to	Class	Object
Object needed	No	Yes
Access non-static	❌ No	✅ Yes
Uses this	❌ No	✅ Yes
🔹 Static Method Overloading
class Demo {
    static void add(int a, int b) {
        System.out.println(a + b);
    }

    static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}

🔹 Static Method Hiding (Exam Point ⭐)
class Parent {
    static void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child");
    }
}


➡ This is method hiding, not overriding

🔹 Common Use Cases

main() method

Utility classes (Math.max())

Factory methods

Helper methods
