package ch09;

public class Ch09_H01 {
    public static void main(String[] args) {
        Ch09H01MyMath A = new Ch09H01MyMath();
        System.out.printf("%d\n", A.getMax(10));
        System.out.printf("%d\n", A.getMax(5, 10));
        System.out.printf("%d\n", A.getMax(5, 10, 15));
    }
}

class Ch09H01MyMath {
    int x;

    int getMax(int a) {
        x = a;
        return x;
    }

    int getMax(int a, int b) {
        if (a > b) {
            x = a;
        } else {
            x = b;
        }
        return x;
    }

    int getMax(int a, int b, int c) {
        getMax(a, b);
        getMax(x, c);
        return x;
    }
}