package ch09;

public class Ch09_16_static_01_without_static {
    public static void main(String[] args) {
        Ch0916Person p1 = new Ch0916Person();
        p1.name = "Peter";
        p1.age = 20;
        Ch0916Person p2 = new Ch0916Person();
        p2.name = "John";
        p2.age = 30;
        p1.output();
        p2.output();
    }
}

class Ch0916Person {
    public int age;
    public String name;

    public void output() {
        System.out.println("Name:" + name);
        System.out.println("Age: " + age);
    }
}