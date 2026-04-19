package ch08;

public class Ch08_H03_Calculator {
    public static void main(String[] args){
        SmallMath calculator = new SmallMath();
        System.out.println(calculator.add(10, 20));
        System.out.println(calculator.sub(10, 20));
        System.out.println(calculator.mul(10, 20));
        System.out.println(calculator.div(10, 20));
    }
}
class SmallMath {
    int add(int x, int y){
        return x + y;
    }
    int sub(int x, int y){
        return x - y;
    }
    int mul(int x, int y){
        return x * y;
    }
    int div(int x, int y){
        return x / y;
    }
}
