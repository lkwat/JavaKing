package ch09;

public class Ch09_21_staticMethod {
    public static void main(String[] args) {
        Ch0921PrintSample.output();  //類別名稱呼叫static方法
        Ch0921PrintSample A = new Ch0921PrintSample();  //類別物件名稱呼叫static方法
        A.output();
    }
}
class Ch0921PrintSample {
    public static void output() {
        System.out.println("測試static方法");
    }
}