package ch09;

public class Ch09_06_Overload {
    public static void main(String[] args) {
        Ch0906MyClass A = new Ch0906MyClass(20);
        A.printInfo();
        Ch0906MyClass B = new Ch0906MyClass("John");
        B.printInfo();
        Ch0906MyClass C =new Ch0906MyClass(25, "Lin");
        C.printInfo();
    }
}

class Ch0906MyClass {
    int age;
    String name;
    Ch0906MyClass(int a) {
        age = a;
    }
    Ch0906MyClass(String str) {
        name = str;
    }
    Ch0906MyClass(int a, String str) {
        age = a;
        name = str;
    }
    void printInfo(){
        System.out.println(name);
        System.out.println(age);
    }
}