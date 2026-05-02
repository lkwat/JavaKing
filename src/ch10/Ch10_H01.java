package ch10;

public class Ch10_H01 {
    public static void main(String[] args) {
        int x1 = 10;
        int x2 = 5;
        int x3 = 15;
        int maxV;
        maxV = 10;
        System.out.println(maxV);
        maxV = Math.max(x1, x2);
        System.out.println(maxV);
        maxV = Math.max(Math.max(x1, x2), x3);
        System.out.println(maxV);
    }
}
