package ch08;
class Ch0803Dog{
    String name;
    String color;
    int age;
    void barking(){
        System.out.println("正在叫");
    }
    void sleeping(){
        System.out.println("正在睡覺");
    }
}
public class Ch08_03_DogMultiObjects {
    public static void main(String[] args){
        Ch0803Dog myDog = new Ch0803Dog();
        Ch0803Dog TomDog= new Ch0803Dog();

        myDog.name = "Lily";
        System.out.print("我的狗名字是 " + myDog.name + " ");
        myDog.barking();

        TomDog.name = "Hali";
        System.out.print("Tom的狗名字是 " + TomDog.name + " ");
        TomDog.sleeping();
    }
}
