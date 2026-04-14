package ch08;
class Dog{
    String name;
    String color;
    int age;
}
public class Ch08_01 {
    public static void main(String[] args){
        Dog myDog = new Dog();
        myDog.name = "Lily";
        myDog.color = "White";
        myDog.age = 5;

        System.out.println("我的狗名字是 : " + myDog.name);
        System.out.println("我的狗顏色是 : " + myDog.color);
        System.out.println("我的狗年齡是 : " + myDog.age);
    }
}
