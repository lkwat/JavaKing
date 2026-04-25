package ch09;

public class Ch09_17_static_02_with_static {
    public static void main(String[] args) {
        Ch0917Person p1 = new Ch0917Person();
        p1.name = "Peter";
        p1.age = 20;
        Ch0917Person p2 = new Ch0917Person();
        p2.name = "John";
        p2.age = 30;
        p1.output();;
        p2.output();
    }
}

class Ch0917Person {
    public static int age;
    public String name;
    public void output() {
        System.out.println("Name:" + name);
        System.out.println("Age: " + age);
    }
}