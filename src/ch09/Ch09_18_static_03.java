package ch09;

public class Ch09_18_static_03 {
    public static void main(String[] args) {
        Ch0918Person.age = 20;
        Ch0918Person p1 = new Ch0918Person("Peter");
        Ch0918Person p2 = new Ch0918Person("John");
        p1.output();
        p2.output();
        Ch0918Person.age = 30;
        p1.output();
        p2.output();
    }
}

class Ch0918Person {
    public static int age;
    public String name;
    public Ch0918Person(String name) {
        this.name = name;
    }
    public void output() {
        System.out.println("Name:" + name);
        System.out.println("Age: " + age);
    }
}