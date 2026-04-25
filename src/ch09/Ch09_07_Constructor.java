package ch09;

public class Ch09_07_Constructor {
    public static void main(String[] args) {
        Ch0907MyClass A = new Ch0907MyClass();
        A.printInfo();
    }
}
class Ch0907MyClass {
    int age;
    String name;
    Ch0907MyClass () {
        age = 50;
        name = "Curry";
    }
    Ch0907MyClass(int a) {
        age = a;
    }
    Ch0907MyClass(String str) {
        name = str;
    }
    Ch0907MyClass (int a, String str) {
        age = a;
        name = str;
    }
    void printInfo() {
        System.out.println(name);
        System.out.println(age);
    }
}
