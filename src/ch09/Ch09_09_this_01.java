package ch09;

public class Ch09_09_this_01 {
    public static void main(String[] args) {
        Ch0909MyClass A = new Ch0909MyClass(20);
        A.printInfo();
        Ch0909MyClass B = new Ch0909MyClass("John");
        B.printInfo();
        Ch0909MyClass C = new Ch0909MyClass(25, "lin");
        C.printInfo();
    }
}

class Ch0909MyClass {
    int age;
    String name;

    Ch0909MyClass(int age) {
        this.age = age;
    }

    Ch0909MyClass(String name) {
        this.name = name;
    }

    Ch0909MyClass(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void printInfo() {
        System.out.println(name);
        System.out.println(age);
    }
}
