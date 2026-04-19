package ch08;

public class Ch08_H01_Dog {
    public static void main(String[] args) {
        Ch08_H01Dog mydog = new Ch08_H01Dog();
        mydog.name = "Lily";
        mydog.color= "White";
        mydog.age = 5;

        System.out.printf("我的狗名字是 : %s\n", mydog.name);
        System.out.printf("我的狗顏色是 : %s\n", mydog.color);
        System.out.printf("我的狗年齡是 : %d\n", mydog.age);
        mydog.barking();
        mydog.eating();
    }
}

class Ch08_H01Dog{
    String name;
    String color;
    int age;
    void barking() {System.out.println("我的狗在叫");}
    void eating() {System.out.println("我的狗在吃東西");}
}