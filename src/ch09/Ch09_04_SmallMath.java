package ch09;

public class Ch09_04_SmallMath {
    public static void main(String[] args){
        SmallMath A = new SmallMath(5,10);
        A.add();
        A.mul();
    }
}

class SmallMath {
    int x, y;
    SmallMath(int a, int b){
        x=a;
        y=b;
    }
    void add(){
        System.out.println("加法結果: " + (x+y));
    }
    void mul(){
        System.out.println("乘法結果: " + (x*y));
    }
}