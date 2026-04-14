package ch08;
class Ch0801Dog{
    String name;
    String color;
    int age;
}
public class Ch08_01_Dog {
    public static void main(String[] args){
        Ch0801Dog myDog = new Ch0801Dog();
        myDog.name = "Lily";
        myDog.color = "White";
        myDog.age = 5;

        System.out.println("我的狗名字是 : " + myDog.name);
        System.out.println("我的狗顏色是 : " + myDog.color);
        System.out.println("我的狗年齡是 : " + myDog.age);
    }
}
