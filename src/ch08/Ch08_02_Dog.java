package ch08;
class Ch0802Dog {
    String name;
    String color;
    int age;
    void barking(){
        System.out.println("我的狗在叫");
    }
}

public class Ch08_02_Dog {
    public static void main(String[] args){
        Ch0802Dog myDog = new Ch0802Dog();
        myDog.name = "Lily";
        myDog.color = "White";
        myDog.age = 5;
        System.out.println("我的狗名字是: " + myDog.name);
        System.out.println("我的狗顏色是: " + myDog.color);
        System.out.println("我的狗年齡是: " + myDog.age);
        myDog.barking();
    }
}
