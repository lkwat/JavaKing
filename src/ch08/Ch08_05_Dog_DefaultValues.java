package ch08;
class Ch0805Dog {
    String name;
    String color;
    int age;
    void printInfo(){
        System.out.println("狗名字是 : " + name);
        System.out.println("狗顏色是 : " + color);
        System.out.println("狗年齡是 : " + age);
    }
}
public class Ch08_05_Dog_DefaultValues {
    public static void main(String[] args){
        Ch0805Dog myDog = new Ch0805Dog();
        myDog.printInfo();
    }
}
