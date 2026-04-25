package ch09;

public class Ch09_08_Overload {
    public static void main(String[] args) {
        Ch0908MyMath A = new Ch0908MyMath();
        A.math(10);
        A.printInfo();
        A.math(10, 10);
        A.printInfo();
        A.math(10, 10, 10);
        A.printInfo();
    }
}
class Ch0908MyMath {
    int x;
    void math (int a) {
        x = a;
    }
    void math (int a, int b) {
        x = a * b;
    }
    void math (int a, int b, int c) {
        x = a * b * c;
    }
    void printInfo() {
        System.out.println(x);
    }
}