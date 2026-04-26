package ch09;

public class Ch09_H03 {
    public static void main(String[] args) {
        Ch09H03DemoConstructor p1 = new Ch09H03DemoConstructor("John", 20);
        p1.output();
        Ch09H03DemoConstructor p2 = new Ch09H03DemoConstructor("Peter", 22);
        p2.output();
    }
}
class Ch09H03DemoConstructor {
    int age;
    String name;
    Ch09H03DemoConstructor() {
        this("NoName", 0);
    }
    Ch09H03DemoConstructor(String name, int age) {
        this.age = age;
        this.name = name;
    }
    void output() {
        System.out.println(name + " " + age);
    }
}